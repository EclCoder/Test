package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f11825a;

    public a(File file) {
        this.f11825a = file;
    }

    protected abstract InputStream a(File file, String str);

    public final InputStream a(String str) {
        return a(this.f11825a, str);
    }

    protected abstract boolean b(File file, String str);

    public final boolean b(String str) {
        return b(this.f11825a, str);
    }
}
