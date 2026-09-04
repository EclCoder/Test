package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f4408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f4409b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4410a;

        static {
            int[] iArr = new int[s.a.values().length];
            try {
                iArr[s.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4410a = iArr;
        }
    }

    public k(j defaultLifecycleObserver, y yVar) {
        kotlin.jvm.internal.s.h(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4408a = defaultLifecycleObserver;
        this.f4409b = yVar;
    }

    @Override // androidx.lifecycle.y
    public void c(b0 source, s.a event) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(event, "event");
        switch (a.f4410a[event.ordinal()]) {
            case 1:
                this.f4408a.a(source);
                break;
            case 2:
                this.f4408a.onStart(source);
                break;
            case 3:
                this.f4408a.h(source);
                break;
            case 4:
                this.f4408a.i(source);
                break;
            case 5:
                this.f4408a.onStop(source);
                break;
            case 6:
                this.f4408a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        y yVar = this.f4409b;
        if (yVar != null) {
            yVar.c(source, event);
        }
    }
}
