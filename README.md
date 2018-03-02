本质:创建一个AS项目,并将Eclipse项目作为Module依赖鱼AS项目,
核心:为Eclipse提供build.gradle,使其能让AS编译
步骤:
创建AndroidStudio项目
为Eclipse项目添加build.gradle(根据eclipse项目目录下的AndroidManifest.xml文件中的packageName、minSdkVersion修改build.gradle中对应的值)
```
compileSdkVersion 23
buildToolsVersion "27.0.3"

defaultConfig {
    minSdkVersion 11
    targetSdkVersion 23
}
```
并为Eclipse配置sourceSets  官网
```
sourceSets {
    main {
        manifest.srcFile 'AndroidManifest.xml'
        aidl.srcDirs = ['src']
        java.srcDirs = ['src']
        resources.srcDirs = ['src']
        res.srcDirs = ['res']
        assets.srcDirs = ['assets']
        jniLibs.srcDirs = ['libs']
        renderscript.srcDirs = ['src']
    }
}
```
将Eclipse项目拷贝至AS项目,与app目录同级
在setting.gradle中添加配置 include EclipseName,并build
在版本控制中忽略build.gradle文件、build目录、.idea目录以及*.iml文件
Done
