package com.singal.permission_libs;

import java.util.List;

/**
 * Project: AndroidPermission
 * Author: zhouya
 *
 */

public interface PermissionListener {
    void onSucceed(int requestCode, List<String> grantPermissions);

    void onFailed(int requestCode,List<String> deniedPermissions);
}
