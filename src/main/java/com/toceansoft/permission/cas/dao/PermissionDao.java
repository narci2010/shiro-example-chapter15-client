package com.toceansoft.permission.cas.dao;

import com.toceansoft.permission.cas.entity.Permission;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-29
 * <p>Version: 1.0
 */
public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}
