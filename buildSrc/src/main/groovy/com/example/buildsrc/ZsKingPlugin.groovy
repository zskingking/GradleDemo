package com.example.buildsrc

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * 自定义插件
 */
class ZsKingPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        def extension = target.getExtensions().create("zsExtension", ZsKingExtension)
        //配置之后执行
        target.afterEvaluate {
            println("name:${extension.name}")
        }
        //声明transform
        def trans = new ZsKingTrans()
        //获取Android插件，干预打包流程
        def baseExt = target.extensions.getByType(BaseExtension)
        //将Android插件注册到transform中
        baseExt.registerTransform(trans)
    }
}

