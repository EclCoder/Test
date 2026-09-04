package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.q;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.videoeditor.ChangeSpeedFragment;
import com.mbridge.msdk.MBridgeConstans;
import fl.o;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import tf.m3;
import uh.n0;
import uh.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/ChangeSpeedFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/m3;", "<init>", "()V", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/m3;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "C", "Luh/n0;", "c", "Lfl/k;", "H", "()Luh/n0;", "speedViewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeSpeedFragment extends com.hecorat.screenrecorder.free.videoeditor.d<m3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.k speedViewModel;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f23222a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f23222a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tl.a aVar) {
            super(0);
            this.f23223a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23223a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fl.k f23224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fl.k kVar) {
            super(0);
            this.f23224a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23224a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.a aVar, fl.k kVar) {
            super(0);
            this.f23225a = aVar;
            this.f23226b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23225a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23226b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment, fl.k kVar) {
            super(0);
            this.f23227a = fragment;
            this.f23228b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory;
            u1 u1VarC = t0.c(this.f23228b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            s1.c defaultViewModelProviderFactory2 = this.f23227a.getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public ChangeSpeedFragment() {
        fl.k kVarA = fl.l.a(o.NONE, new b(new a(this)));
        this.speedViewModel = t0.b(this, l0.b(n0.class), new c(kVarA), new d(null, kVarA), new e(this, kVarA));
    }

    private final n0 H() {
        return (n0) this.speedViewModel.getValue();
    }

    public static final void J(ChangeSpeedFragment changeSpeedFragment, Slider slider, float f10, boolean z10) {
        s.h(slider, "slider");
        changeSpeedFragment.H().k(f10);
    }

    public static final String K(float f10) {
        o0 o0Var = o0.f43602a;
        String str = String.format("%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
        s.g(str, "format(...)");
        return str;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        super.C();
        y yVarV = v();
        Object objF = H().j().f();
        s.e(objF);
        yVarV.d2(((Number) objF).floatValue());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public m3 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        m3 m3VarY = m3.Y(layoutInflater, container, false);
        s.g(m3VarY, "inflate(...)");
        return m3VarY;
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((m3) w()).a0(H());
        H().k(v().h1());
        ((m3) w()).E.m(new com.google.android.material.slider.a() { // from class: oh.j1
            @Override // com.google.android.material.slider.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Slider slider, float f10, boolean z10) {
                ChangeSpeedFragment.J(this.f48703a, slider, f10, z10);
            }
        });
        ((m3) w()).E.setLabelFormatter(new com.google.android.material.slider.f() { // from class: oh.k1
            @Override // com.google.android.material.slider.f
            public final String a(float f10) {
                return ChangeSpeedFragment.K(f10);
            }
        });
    }
}
