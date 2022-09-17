package com.shoesStore.dao;

import com.shoesStore.entity.Account;

public interface AccountDao {
	public Account getAccountByUserName(String userName);
}
