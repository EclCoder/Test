package j5;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b5.i f42026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f42028c;

    public i(b5.i iVar, String str, WorkerParameters.a aVar) {
        this.f42026a = iVar;
        this.f42027b = str;
        this.f42028c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f42026a.m().k(this.f42027b, this.f42028c);
    }
}
