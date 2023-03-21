package ch11.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch11.domain.userinfo.UserInfo;
import ch11.domain.userinfo.dao.UserInfoDao;
import ch11.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch11.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();		//두개의 쌍으로 되어있는 값을 따로따로 읽어서 이 값은 뭘 가지고있는지 반환 (Rvalue)
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("dali186");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("김주원");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("sb error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}
