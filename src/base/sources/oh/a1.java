package oh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.xiaopo.flying.sticker.StickerView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import tf.i7;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001,\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0016\u0010\bJ\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H$¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Loh/a1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lbk/h;", "sticker", "Lfl/g0;", "E", "(Lbk/h;)V", "C", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "y", "", "Lqh/i;", "x", "()Ljava/util/List;", "", "B", "(Lbk/h;)Z", "Ltf/i7;", "a", "Ltf/i7;", "w", "()Ltf/i7;", "D", "(Ltf/i7;)V", "binding", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", "v", "()Luh/y;", "activityViewModel", "oh/a1$f", "c", "Loh/a1$f;", "stickerListener", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a1 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    protected i7 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k activityViewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new c(this), new d(null, this), new e(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f stickerListener = new f();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48583r;

        /* JADX INFO: renamed from: oh.a1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0750a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48585r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ a1 f48586s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0750a(a1 a1Var, kl.f fVar) {
                super(2, fVar);
                this.f48586s = a1Var;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(fl.g0 g0Var, kl.f fVar) {
                return ((C0750a) create(g0Var, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                return new C0750a(this.f48586s, fVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48585r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                this.f48586s.C();
                return fl.g0.f38750a;
            }
        }

        a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return a1.this.new a(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48583r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarC0 = a1.this.v().C0();
                C0750a c0750a = new C0750a(a1.this, null);
                kotlin.jvm.internal.s.f(zVarC0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48583r = 1;
                if (hm.g.i(zVarC0, c0750a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            throw new IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements androidx.lifecycle.q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f48587a;

        b(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f48587a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f48587a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f48587a.invoke(obj);
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
        final /* synthetic */ Fragment f48588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f48588a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48588a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48589a = aVar;
            this.f48590b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48589a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48590b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f48591a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48591a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements StickerView.b {
        f() {
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void a(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void b(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
            a1.this.E(sticker);
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void c(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
            a1.this.E(sticker);
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void d(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void e(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void f(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
            a1.this.E(sticker);
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void g(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
            if (a1.this.B(sticker)) {
                a1.this.v().n0().q(null);
                uh.y yVarV = a1.this.v();
                String strJ = sticker.j();
                kotlin.jvm.internal.s.g(strJ, "getId(...)");
                yVarV.w1(strJ);
            }
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void h(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
            a1.this.y(sticker);
        }

        @Override // com.xiaopo.flying.sticker.StickerView.b
        public void i(bk.h sticker) {
            kotlin.jvm.internal.s.h(sticker, "sticker");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 A(a1 a1Var, Long l10) {
        Object next;
        List<qh.i> listX = a1Var.x();
        if (!listX.isEmpty()) {
            List<bk.h> stickers = a1Var.w().A.getStickers();
            kotlin.jvm.internal.s.g(stickers, "getStickers(...)");
            for (bk.h hVar : gl.r.I0(stickers)) {
                Iterator it = listX.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.s.c(((qh.i) next).getId(), hVar.j()));
                qh.i iVar = (qh.i) next;
                if (iVar == null || l10.longValue() < iVar.c() || l10.longValue() > iVar.c() + iVar.b()) {
                    a1Var.w().A.B(hVar.j());
                    qh.k kVar = (qh.k) a1Var.v().n0().f();
                    if (kotlin.jvm.internal.s.c(kVar != null ? kVar.getId() : null, hVar.j())) {
                        a1Var.v().n0().q(null);
                    }
                }
            }
            for (qh.i iVar2 : listX) {
                if (!a1Var.w().A.p(iVar2.getId()) && l10.longValue() >= iVar2.c() && l10.longValue() <= iVar2.c() + iVar2.b()) {
                    StickerView stickerView = a1Var.w().A;
                    kotlin.jvm.internal.s.g(stickerView, "stickerView");
                    sh.b.c(stickerView, iVar2, a1Var.w().A.getWidth(), a1Var.w().A.getHeight());
                    a1Var.v().n0().q(iVar2);
                    wp.a.a("One element added", new Object[0]);
                    break;
                }
            }
        }
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        getParentFragmentManager().q().n(this).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(bk.h sticker) {
        for (qh.i iVar : x()) {
            if (kotlin.jvm.internal.s.c(iVar.getId(), sticker.j())) {
                iVar.l(sticker.m());
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(final a1 a1Var) {
        a1Var.v().X0().j(a1Var.getViewLifecycleOwner(), new b(new Function1() { // from class: oh.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a1.A(this.f48918a, (Long) obj);
            }
        }));
    }

    protected abstract boolean B(bk.h sticker);

    protected final void D(i7 i7Var) {
        kotlin.jvm.internal.s.h(i7Var, "<set-?>");
        this.binding = i7Var;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        D(i7.Y(inflater, container, false));
        w().A.F(this.stickerListener);
        View viewB = w().B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        w().A.post(new Runnable() { // from class: oh.y0
            @Override // java.lang.Runnable
            public final void run() {
                a1.z(this.f48907a);
            }
        });
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner).d(new a(null));
    }

    protected final uh.y v() {
        return (uh.y) this.activityViewModel.getValue();
    }

    protected final i7 w() {
        i7 i7Var = this.binding;
        if (i7Var != null) {
            return i7Var;
        }
        kotlin.jvm.internal.s.w("binding");
        return null;
    }

    protected abstract List x();

    protected abstract void y(bk.h sticker);
}
