package zi;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OrientationEventListener f58972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f58973b = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f58975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f58976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f58977d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, int i10, boolean z10, boolean z11, Context context2, b bVar) {
            super(context, i10);
            this.f58974a = z10;
            this.f58975b = z11;
            this.f58976c = context2;
            this.f58977d = bVar;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int i11 = (((i10 + 45) / 90) % 4) * 90;
            if (this.f58974a && c.this.f58973b == i11) {
                return;
            }
            if (!this.f58975b || c.this.d(this.f58976c) == i11) {
                c.this.f58973b = i11;
                this.f58977d.a(i11, i11 == 0 || i11 == 180);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(int i10, boolean z10);
    }

    public c(Context context, boolean z10, boolean z11, b bVar) {
        this.f58972a = new a(context, 3, z10, z11, context, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(Context context) {
        int iA = ri.a.a(context);
        if (iA == 0) {
            return 270;
        }
        return iA - 90;
    }

    public void e() {
        if (this.f58972a.canDetectOrientation()) {
            this.f58973b = -1;
            this.f58972a.enable();
        }
    }

    public void f() {
        this.f58972a.disable();
        this.f58973b = -1;
    }
}
