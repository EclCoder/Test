package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.e.b;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements ILoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f11700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f11701b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        if (file == null) {
            throw new RuntimeException("resRootDir == null");
        }
        this.f11700a = new b(context, str, file);
    }

    public final int a(String str) {
        if (this.f11701b.get()) {
            throw new RuntimeException("released!");
        }
        return this.f11700a.b(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public boolean exist(String str) {
        if (this.f11701b.get()) {
            throw new RuntimeException("released!");
        }
        return this.f11700a.c(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public Map<String, Long> getChannelVersion() {
        return this.f11700a.b();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public InputStream getInputStream(String str) {
        if (this.f11701b.get()) {
            throw new RuntimeException("released!");
        }
        GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        return this.f11700a.a(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public String getResRootDir() {
        return this.f11700a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public void release() {
        if (this.f11701b.getAndSet(true)) {
            return;
        }
        this.f11700a.c();
    }
}
