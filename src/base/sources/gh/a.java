package gh;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import tf.n6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FBLiveDestination f39183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f39184d;

    /* JADX INFO: renamed from: gh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0587a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0588a f39185c = new C0588a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n6 f39186b;

        /* JADX INFO: renamed from: gh.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0588a {
            public /* synthetic */ C0588a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C0587a a(ViewGroup parent) {
                s.h(parent, "parent");
                n6 n6VarY = n6.Y(LayoutInflater.from(parent.getContext()), parent, false);
                s.g(n6VarY, "inflate(...)");
                return new C0587a(n6VarY, null);
            }

            private C0588a() {
            }
        }

        public /* synthetic */ C0587a(n6 n6Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(n6Var);
        }

        public final void b(FBLiveDestination item, FBLiveDestination selectedDestination, c clickListener) {
            s.h(item, "item");
            s.h(selectedDestination, "selectedDestination");
            s.h(clickListener, "clickListener");
            this.f39186b.b0(item);
            this.f39186b.a0(clickListener);
            this.f39186b.A.setChecked(s.c(item.getId(), selectedDestination.getId()) && item.getType() == selectedDestination.getType());
        }

        private C0587a(n6 n6Var) {
            super(n6Var.B());
            this.f39186b = n6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FBLiveDestination selectedDestination, c clickListener) {
        super(new b());
        s.h(selectedDestination, "selectedDestination");
        s.h(clickListener, "clickListener");
        this.f39183c = selectedDestination;
        this.f39184d = clickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0587a holder, int i10) {
        s.h(holder, "holder");
        FBLiveDestination fBLiveDestination = (FBLiveDestination) g(i10);
        s.e(fBLiveDestination);
        holder.b(fBLiveDestination, this.f39183c, this.f39184d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0587a onCreateViewHolder(ViewGroup parent, int i10) {
        s.h(parent, "parent");
        return C0587a.f39185c.a(parent);
    }
}
