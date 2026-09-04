package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f11832a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f11833b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f11834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileLock f11835d;

    private b(String str, FileLock fileLock) {
        this.f11834c = str;
        this.f11835d = fileLock;
    }

    public static b a(String str) throws Exception {
        f11833b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f11832a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e10) {
            f11833b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f11835d.a();
            this.f11835d.b();
            Lock lock = f11832a.get(this.f11834c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f11833b.unlock();
        }
    }
}
