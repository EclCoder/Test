package tb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f53288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f53289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f53290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53292e;

    public i(long j10, long j11) {
        this.f53290c = null;
        this.f53291d = 0;
        this.f53292e = 1;
        this.f53288a = j10;
        this.f53289b = j11;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        iVar.f53291d = valueAnimator.getRepeatCount();
        iVar.f53292e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f());
            valueAnimator.setRepeatMode(g());
        }
    }

    public long c() {
        return this.f53288a;
    }

    public long d() {
        return this.f53289b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f53290c;
        return timeInterpolator != null ? timeInterpolator : b.f53276b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && f() == iVar.f() && g() == iVar.g()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int f() {
        return this.f53291d;
    }

    public int g() {
        return this.f53292e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + UoyZyZEcGYBpIg.NAyvLsMyQ;
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f53291d = 0;
        this.f53292e = 1;
        this.f53288a = j10;
        this.f53289b = j11;
        this.f53290c = timeInterpolator;
    }
}
