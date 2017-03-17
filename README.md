# AndroidPermission
Android Permission

Add it in your root build.gradle at the end of repositories:

          allprojects {
              repositories {
                ...
                maven { url 'https://jitpack.io' }
              }
            }

Add the dependency:

      dependencies {
              compile 'com.github.SingalLine:AndroidPermission:v1.0.1'
      }

申请权限

一个权限

          AndPermission.with(this)
              .requestCode(100)
              .permission(Manifest.permission.WRITE_CONTACTS)
              .send();

多个权限

          AndPermission.with(this)
              .requestCode(100)
              .permission(Manifest.permission.WRITE_CONTACTS, Manifest.permission.READ_SMS)
              .send();

在使用到特殊权限时，只需要在Activity、Fragment中直接调用，等到AndPermission回调时即可执行相应的代码。

注意 1. 如果你的Activity继承的是AppCompatActivity、FragmentActivity或者它们的子类，那么你直接请求权限就可以。 2. 如果你的Fragment继承的是android.support.v4.app.Fragment或者它的子类，那么你直接请求权限就可以。 3. 如果你继承的是android.app.Activity、android.app.Fragment、在6.0以下的手机是没有onRequestPermissionsResult()方法的，所以需要在申请权限前判断：

          // 先判断是否有权限。
          if(AndPermission.hasPermission(this, Manifest.permission.READ_SMS)) {
              // 有权限，直接do anything.
          } else {
              // 申请权限。
              AndPermission.with(this)
                  .requestCode(100)
                  .permission(Manifest.permission.WRITE_CONTACTS, Manifest.permission.READ_SMS)
                  .send();
          }


最后感谢---https://github.com/yanzhenjie/AndPermission
