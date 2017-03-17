package com.singal.permission_libs;

/**
 * Project: AndroidPermission
 * Author: zhouya
 *
 *
 */

public interface Rationale extends Cancelable{

    /**
     * go request permission;
     */
    void resume();
}
