package com.example.buildsrc

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform


/**
 * 自定义transform
 * 通过transform来干预Android打包过程,实现面向切面
 */
class ZsKingTrans extends  Transform {


    @Override
    String getName() {
        return null
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return null
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return null
    }

    @Override
    boolean isIncremental() {
        return false
    }
}

