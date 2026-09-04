package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.databinding.p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import uh.y;
import y3.d1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J!\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00028\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Landroidx/databinding/p;", "VB", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lfl/g0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "y", "C", "onDestroyView", "layoutInflater", "x", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/databinding/p;", "a", "Landroidx/databinding/p;", "w", "()Landroidx/databinding/p;", "E", "(Landroidx/databinding/p;)V", "binding", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", "v", "()Luh/y;", "activityViewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d<VB extends p> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public p binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final fl.k activityViewModel = t0.b(this, l0.b(y.class), new b(this), new c(null, this), new C0343d(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23407a;

        public a(Function1 function) {
            s.h(function, "function");
            this.f23407a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23407a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23407a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23408a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f23408a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23408a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23409a = aVar;
            this.f23410b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23409a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23410b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0343d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0343d(Fragment fragment) {
            super(0);
            this.f23411a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23411a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final void A(d dVar, View view) {
        dVar.y();
    }

    public static final void B(d dVar, View view) {
        dVar.C();
    }

    public static final void D(d dVar) {
        d1 d1VarS = androidx.navigation.fragment.a.a(dVar).s();
        if (d1VarS != null) {
            int iP = d1VarS.p();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("currentDestination ");
            d1 d1VarS2 = androidx.navigation.fragment.a.a(dVar).s();
            sb2.append((Object) (d1VarS2 != null ? d1VarS2.u() : null));
            wp.a.a(sb2.toString(), new Object[0]);
            dVar.v().r1(iP);
        }
    }

    public static final g0 z(d dVar, View view, com.google.android.exoplayer2.k kVar) {
        if (!(dVar instanceof CutFragment)) {
            ((PlayerControlView) view.findViewById(R.id.player_control_view)).setPlayer(kVar);
        }
        return g0.f38750a;
    }

    public void C() {
        v().Z1(true);
        androidx.navigation.fragment.a.a(this).L();
    }

    protected final void E(p pVar) {
        s.h(pVar, "<set-?>");
        this.binding = pVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.h(inflater, "inflater");
        v().c2((this instanceof CutFragment) || (this instanceof AddBackgroundFragment) || (this instanceof ChangeSpeedFragment) || (this instanceof CropFragment));
        v().i0(!(this instanceof PreviewFragment));
        LayoutInflater layoutInflater = getLayoutInflater();
        s.g(layoutInflater, "getLayoutInflater(...)");
        E(x(layoutInflater, container));
        w().S(getViewLifecycleOwner());
        final View viewB = w().B();
        v().W0().j(getViewLifecycleOwner(), new a(new Function1() { // from class: oh.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.d.z(this.f48870a, viewB, (com.google.android.exoplayer2.k) obj);
            }
        }));
        ImageButton imageButton = (ImageButton) viewB.findViewById(R.id.close_iv);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: oh.w0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.hecorat.screenrecorder.free.videoeditor.d.A(this.f48887a, view);
                }
            });
        }
        ImageButton imageButton2 = (ImageButton) viewB.findViewById(R.id.confirm_iv);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: oh.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.hecorat.screenrecorder.free.videoeditor.d.B(this.f48900a, view);
                }
            });
        }
        View viewB2 = w().B();
        s.g(viewB2, "getRoot(...)");
        return viewB2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        v().C1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        view.post(new Runnable() { // from class: oh.u0
            @Override // java.lang.Runnable
            public final void run() {
                com.hecorat.screenrecorder.free.videoeditor.d.D(this.f48864a);
            }
        });
    }

    protected final y v() {
        return (y) this.activityViewModel.getValue();
    }

    protected final p w() {
        p pVar = this.binding;
        if (pVar != null) {
            return pVar;
        }
        s.w("binding");
        return null;
    }

    public abstract p x(LayoutInflater layoutInflater, ViewGroup container);

    public void y() {
        androidx.navigation.fragment.a.a(this).L();
    }
}
