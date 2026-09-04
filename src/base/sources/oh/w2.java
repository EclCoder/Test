package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import com.hecorat.screenrecorder.free.R;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import tf.a5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Loh/w2;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Luh/o0;", "a", "Lfl/k;", "w", "()Luh/o0;", "stickerViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w2 extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fl.k stickerViewModel;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48891a;

        b(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48891a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48891a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48891a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f48892a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f48892a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.a aVar) {
            super(0);
            this.f48893a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.u1 invoke() {
            return (androidx.lifecycle.u1) this.f48893a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ fl.k f48894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fl.k kVar) {
            super(0);
            this.f48894a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            return androidx.fragment.app.t0.c(this.f48894a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fl.k f48896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.a aVar, fl.k kVar) {
            super(0);
            this.f48895a = aVar;
            this.f48896b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48895a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            androidx.lifecycle.u1 u1VarC = androidx.fragment.app.t0.c(this.f48896b);
            androidx.lifecycle.q qVar = u1VarC instanceof androidx.lifecycle.q ? (androidx.lifecycle.q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fl.k f48898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, fl.k kVar) {
            super(0);
            this.f48897a = fragment;
            this.f48898b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory;
            androidx.lifecycle.u1 u1VarC = androidx.fragment.app.t0.c(this.f48898b);
            androidx.lifecycle.q qVar = u1VarC instanceof androidx.lifecycle.q ? (androidx.lifecycle.q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            androidx.lifecycle.s1.c defaultViewModelProviderFactory2 = this.f48897a.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public w2() {
        fl.k kVarA = fl.l.a(fl.o.NONE, new d(new c(this)));
        this.stickerViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.o0.class), new e(kVarA), new f(null, kVarA), new g(this, kVarA));
    }

    private final uh.o0 w() {
        return (uh.o0) this.stickerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(w2 w2Var, View view) {
        w2Var.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 y(w2 w2Var, ng.b imageItem) {
        kotlin.jvm.internal.s.h(imageItem, "imageItem");
        w2Var.getParentFragmentManager().y1("req_sticker_single", j0.e.a(fl.w.a("sticker_single", imageItem)));
        w2Var.dismiss();
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 z(ph.a0 a0Var, List list) {
        a0Var.i(list);
        return fl.g0.f38750a;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.FullScreenDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        a5 a5VarY = a5.Y(inflater, container, false);
        kotlin.jvm.internal.s.g(a5VarY, "inflate(...)");
        a5VarY.A.setOnClickListener(new View.OnClickListener() { // from class: oh.t2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w2.x(this.f48856a, view);
            }
        });
        final ph.a0 a0Var = new ph.a0(new Function1() { // from class: oh.u2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.y(this.f48866a, (ng.b) obj);
            }
        });
        a5VarY.B.setAdapter(a0Var);
        a5VarY.B.setLayoutManager(new GridLayoutManager(requireContext(), nh.b.h(requireContext()) / AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        w().l().j(getViewLifecycleOwner(), new b(new Function1() { // from class: oh.v2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w2.z(a0Var, (List) obj);
            }
        }));
        View viewB = a5VarY.B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }
}
