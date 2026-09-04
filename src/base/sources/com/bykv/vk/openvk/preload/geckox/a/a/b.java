package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11728a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f11730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected File f11731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f11732e;

    static {
        new f();
        f11729b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f11730c = aVar;
        this.f11731d = file;
        this.f11732e = list;
    }
}
