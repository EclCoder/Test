package yo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import xo.m;
import zn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Lock f58168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Set f58169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected m f58170c;

    protected a() {
        h.k(getClass());
        this.f58169b = new HashSet();
        this.f58170c = new m();
        this.f58168a = new ReentrantLock();
    }
}
