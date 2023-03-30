package ch11.domain.userinfo.dao.oracle;

import ch11.domain.userinfo.UserInfo;
import ch11.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into Oracle DB userID = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into Oracle DB userID = " + userInfo.getUserId());
	}

}
