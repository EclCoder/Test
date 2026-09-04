package cm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ ml.a f10136j = ml.b.a(d());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeUnit f10137a;

    d(TimeUnit timeUnit) {
        this.f10137a = timeUnit;
    }

    public final TimeUnit g() {
        return this.f10137a;
    }
}
