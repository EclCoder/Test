package oh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.xiaopo.flying.sticker.StickerView;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Loh/r3;", "Loh/a1;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lbk/h;", "sticker", "y", "(Lbk/h;)V", "", "Lqh/i;", "x", "()Ljava/util/List;", "", "B", "(Lbk/h;)Z", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r3 extends a1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48831r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f48833t;

        /* JADX INFO: renamed from: oh.r3$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class C0753a extends kotlin.coroutines.jvm.internal.m implements tl.o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f48834r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f48835s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ r3 f48836t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ View f48837u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0753a(r3 r3Var, View view, kl.f fVar) {
                super(2, fVar);
                this.f48836t = r3Var;
                this.f48837u = view;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(qh.c cVar, kl.f fVar) {
                return ((C0753a) create(cVar, fVar)).invokeSuspend(fl.g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                C0753a c0753a = new C0753a(this.f48836t, this.f48837u, fVar);
                c0753a.f48835s = obj;
                return c0753a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f48834r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                qh.c cVar = (qh.c) this.f48835s;
                this.f48836t.w().A.B(cVar.getId());
                StickerView stickerView = this.f48836t.w().A;
                kotlin.jvm.internal.s.g(stickerView, "stickerView");
                sh.b.c(stickerView, cVar, this.f48837u.getWidth(), this.f48837u.getHeight());
                return fl.g0.f38750a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kl.f fVar) {
            super(2, fVar);
            this.f48833t = view;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return r3.this.new a(this.f48833t, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f48831r;
            if (i10 == 0) {
                fl.s.b(obj);
                hm.z zVarO0 = r3.this.v().o0();
                C0753a c0753a = new C0753a(r3.this, this.f48833t, null);
                kotlin.jvm.internal.s.f(zVarO0, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f48831r = 1;
                if (hm.g.i(zVarO0, c0753a, this) == objF) {
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

    @Override // oh.a1
    protected boolean B(bk.h sticker) {
        kotlin.jvm.internal.s.h(sticker, "sticker");
        for (qh.c cVar : v().H0()) {
            if (kotlin.jvm.internal.s.c(cVar.getId(), sticker.j())) {
                v().M1(cVar);
                return true;
            }
        }
        return false;
    }

    @Override // oh.a1, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        StickerView stickerView = w().A;
        kotlin.jvm.internal.s.g(stickerView, "stickerView");
        sh.b.C(contextRequireContext, stickerView, false);
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.c0.a(viewLifecycleOwner).d(new a(view, null));
    }

    @Override // oh.a1
    protected List x() {
        List listH0 = v().H0();
        kotlin.jvm.internal.s.f(listH0, "null cannot be cast to non-null type kotlin.collections.MutableList<com.hecorat.screenrecorder.free.videoeditor.data.StickerItem>");
        return kotlin.jvm.internal.p0.c(listH0);
    }

    @Override // oh.a1
    protected void y(bk.h sticker) {
        kotlin.jvm.internal.s.h(sticker, "sticker");
    }
}
