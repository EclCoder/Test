package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f28624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f28625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f28626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f28627d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f28626c = dVar2;
        this.f28624a = dVar;
        this.f28625b = eVar;
        this.f28627d = aVar;
    }

    public void a(Object obj) {
        this.f28627d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.f28626c.a(this.f28624a, this.f28625b, this.f28627d);
    }
}
