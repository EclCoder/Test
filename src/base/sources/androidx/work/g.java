package androidx.work;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f7843c;

    public g(int i10, Notification notification, int i11) {
        this.f7841a = i10;
        this.f7843c = notification;
        this.f7842b = i11;
    }

    public int a() {
        return this.f7842b;
    }

    public Notification b() {
        return this.f7843c;
    }

    public int c() {
        return this.f7841a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f7841a == gVar.f7841a && this.f7842b == gVar.f7842b) {
            return this.f7843c.equals(gVar.f7843c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f7841a * 31) + this.f7842b) * 31) + this.f7843c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f7841a + ", mForegroundServiceType=" + this.f7842b + ", mNotification=" + this.f7843c + '}';
    }
}
