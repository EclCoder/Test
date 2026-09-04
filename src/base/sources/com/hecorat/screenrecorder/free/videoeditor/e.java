package com.hecorat.screenrecorder.free.videoeditor;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.activity.d0;
import androidx.activity.i0;
import androidx.activity.w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.q;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import com.google.android.gms.ads.RequestConfiguration;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import em.o0;
import fl.g0;
import hm.z;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import nh.f0;
import tf.a4;
import tl.o;
import uh.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/e;", "Landroidx/fragment/app/m;", "<init>", "()V", "Lfl/g0;", "E", "M", "Landroidx/fragment/app/s;", "activity", "", "logs", "J", "(Landroidx/fragment/app/s;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "onResume", "onDestroyView", "Ltf/a4;", "a", "Ltf/a4;", "binding", "Luh/g0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "()Luh/g0;", "viewmodel", "Luh/y;", "c", "F", "()Luh/y;", "editorViewModel", "Llf/i;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llf/i;", "hybridAdsManager", "e", "Ljava/lang/String;", "command", "f", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a4 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final fl.k viewmodel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.k editorViewModel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public lf.i hybridAdsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String command;

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.e$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(String commandStr, String outputPath, long j10, String type, ArrayList inputPathList) {
            s.h(commandStr, "commandStr");
            s.h(outputPath, "outputPath");
            s.h(type, "type");
            s.h(inputPathList, "inputPathList");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("command", commandStr);
            bundle.putString("outputPath", outputPath);
            bundle.putLong("duration", j10);
            bundle.putString("type", type);
            bundle.putParcelableArrayList("inputPathList", inputPathList);
            eVar.setArguments(bundle);
            return eVar;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends d0 {
        public b() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            e.this.M();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23419r;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static final class a extends kotlin.coroutines.jvm.internal.m implements o {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f23421r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f23422s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ e f23423t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, kl.f fVar) {
                super(2, fVar);
                this.f23423t = eVar;
            }

            @Override // tl.o
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, kl.f fVar) {
                return ((a) create(str, fVar)).invokeSuspend(g0.f38750a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kl.f create(Object obj, kl.f fVar) {
                a aVar = new a(this.f23423t, fVar);
                aVar.f23422s = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ll.b.f();
                if (this.f23421r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
                String str = (String) this.f23422s;
                androidx.fragment.app.s activity = this.f23423t.getActivity();
                if (activity != null) {
                    e eVar = this.f23423t;
                    if (str.length() > 0) {
                        eVar.J(activity, str);
                    }
                }
                return g0.f38750a;
            }
        }

        public c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return e.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f23419r;
            if (i10 == 0) {
                fl.s.b(obj);
                z zVarD = e.this.G().D();
                a aVar = new a(e.this, null);
                s.f(zVarD, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.f23419r = 1;
                if (hm.g.i(zVarD, aVar, this) == objF) {
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
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        public d() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            a4 a4Var = e.this.binding;
            if (a4Var == null) {
                s.w("binding");
                a4Var = null;
            }
            a4Var.A.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            lf.i iVar = e.this.hybridAdsManager;
            if (iVar != null) {
                iVar.k();
            }
        }
    }

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0344e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0344e(Fragment fragment) {
            super(0);
            this.f23425a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23425a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23426a = aVar;
            this.f23427b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23426a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23427b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23428a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f23428a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23428a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23429a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f23429a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f23429a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.a aVar) {
            super(0);
            this.f23430a = aVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return (u1) this.f23430a.invoke();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fl.k f23431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(fl.k kVar) {
            super(0);
            this.f23431a = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            return t0.c(this.f23431a).getViewModelStore();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class k extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.a aVar, fl.k kVar) {
            super(0);
            this.f23432a = aVar;
            this.f23433b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23432a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            u1 u1VarC = t0.c(this.f23433b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            return qVar != null ? qVar.getDefaultViewModelCreationExtras() : q1.a.b.f50288c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class l extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fl.k f23435b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment, fl.k kVar) {
            super(0);
            this.f23434a = fragment;
            this.f23435b = kVar;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory;
            u1 u1VarC = t0.c(this.f23435b);
            q qVar = u1VarC instanceof q ? (q) u1VarC : null;
            if (qVar != null && (defaultViewModelProviderFactory = qVar.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            s1.c defaultViewModelProviderFactory2 = this.f23434a.getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    public e() {
        fl.k kVarA = fl.l.a(fl.o.NONE, new i(new h(this)));
        this.viewmodel = t0.b(this, l0.b(uh.g0.class), new j(kVarA), new k(null, kVarA), new l(this, kVarA));
        this.editorViewModel = t0.b(this, l0.b(y.class), new C0344e(this), new f(null, this), new g(this));
        this.command = "";
    }

    private final void E() {
        G().E().q(null);
        G().A().q(0);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            if (parentFragment instanceof PlayerFragment) {
                dismiss();
                return;
            }
            dismiss();
            androidx.fragment.app.s activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private final y F() {
        return (y) this.editorViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh.g0 G() {
        return (uh.g0) this.viewmodel.getValue();
    }

    public static final void H(e eVar, View view) {
        eVar.M();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public static final g0 I(e eVar, String str, Uri uri) {
        vg.b bVar;
        if (uri != null) {
            Fragment parentFragment = eVar.getParentFragment();
            if (parentFragment instanceof CompressFragment) {
                bVar = vg.b.VIDEO_COMPRESSOR;
            } else if (parentFragment instanceof PlayerFragment) {
                bVar = vg.b.AUTO_CAPTION;
                if (!eVar.F().m1()) {
                    bVar = null;
                }
            } else {
                bVar = null;
            }
            f0.C(eVar.requireContext(), uri, str, bVar != null ? bVar.getId() : null);
            eVar.E();
        }
        return g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(final androidx.fragment.app.s activity, String logs) {
        final String str = nh.l0.f47742a.h() + "\nCommand: " + this.command + '\n' + logs;
        new AlertDialog.Builder(activity).setMessage(R.string.toast_export_failed).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: oh.b2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.hecorat.screenrecorder.free.videoeditor.e.K(this.f48609a, dialogInterface, i10);
            }
        }).setPositiveButton(R.string.report_error, new DialogInterface.OnClickListener() { // from class: oh.c2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.hecorat.screenrecorder.free.videoeditor.e.L(activity, this, str, dialogInterface, i10);
            }
        }).show();
    }

    public static final void K(e eVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        eVar.dismiss();
    }

    public static final void L(androidx.fragment.app.s sVar, e eVar, String str, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        nh.l0 l0Var = nh.l0.f47742a;
        String string = eVar.getString(R.string.report_error);
        s.g(string, "getString(...)");
        l0Var.B(sVar, string, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        new androidx.appcompat.app.c.a(requireContext()).e(R.string.cancel_export_warning).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: oh.d2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.hecorat.screenrecorder.free.videoeditor.e.N(this.f48645a, dialogInterface, i10);
            }
        }).setNegativeButton(R.string.f22515no, new DialogInterface.OnClickListener() { // from class: oh.e2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.hecorat.screenrecorder.free.videoeditor.e.O(dialogInterface, i10);
            }
        }).n();
    }

    public static final void N(e eVar, DialogInterface dialogInterface, int i10) {
        eVar.G().q();
        dialogInterface.dismiss();
        eVar.dismiss();
    }

    public static final void O(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.FullScreenDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.h(inflater, "inflater");
        a4 a4VarY = a4.Y(inflater, container, false);
        this.binding = a4VarY;
        if (a4VarY == null) {
            s.w("binding");
            a4VarY = null;
        }
        View viewB = a4VarY.B();
        s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.h();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        lf.i iVar = this.hybridAdsManager;
        if (iVar != null) {
            iVar.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ArrayList parcelableArrayList;
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        a4 a4Var = null;
        String string = arguments != null ? arguments.getString("command") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("outputPath") : null;
        Bundle arguments3 = getArguments();
        Long lValueOf = arguments3 != null ? Long.valueOf(arguments3.getLong("duration")) : null;
        Bundle arguments4 = getArguments();
        final String string3 = arguments4 != null ? arguments4.getString("type") : null;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments5.getParcelableArrayList("inputPathList", qh.e.class) : arguments5.getParcelableArrayList("inputPathList");
        } else {
            parcelableArrayList = null;
        }
        if (string == null || string2 == null || lValueOf == null || string3 == null || parcelableArrayList == null) {
            return;
        }
        a4 a4Var2 = this.binding;
        if (a4Var2 == null) {
            s.w("binding");
            a4Var2 = null;
        }
        a4Var2.B.setOnClickListener(new View.OnClickListener() { // from class: oh.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.hecorat.screenrecorder.free.videoeditor.e.H(this.f48919a, view2);
            }
        });
        Dialog dialog = getDialog();
        s.f(dialog, "null cannot be cast to non-null type androidx.activity.ComponentDialog");
        i0 onBackPressedDispatcher = ((w) dialog).getOnBackPressedDispatcher();
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new b());
        a4 a4Var3 = this.binding;
        if (a4Var3 == null) {
            s.w("binding");
            a4Var3 = null;
        }
        a4Var3.a0(G());
        a4 a4Var4 = this.binding;
        if (a4Var4 == null) {
            s.w("binding");
            a4Var4 = null;
        }
        a4Var4.S(getViewLifecycleOwner());
        G().y(string, string2, lValueOf.longValue(), string3, parcelableArrayList);
        this.command = string;
        G().E().j(getViewLifecycleOwner(), new com.hecorat.screenrecorder.free.videoeditor.f(new Function1() { // from class: oh.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.e.I(this.f48593a, string3, (Uri) obj);
            }
        }));
        b0 viewLifecycleOwner2 = getViewLifecycleOwner();
        s.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        c0.a(viewLifecycleOwner2).d(new c(null));
        if (nh.l0.o()) {
            return;
        }
        lf.l.c cVar = lf.l.f44461f;
        lf.l lVarA = cVar.a(lf.l.a.EXPORT);
        lf.c.C0675c c0675c = lf.c.f44397g;
        lf.c cVarA = c0675c.a(lf.c.a.EXPORT);
        a4 a4Var5 = this.binding;
        if (a4Var5 == null) {
            s.w("binding");
            a4Var5 = null;
        }
        RelativeLayout relativeLayout = a4Var5.A;
        a4 a4Var6 = this.binding;
        if (a4Var6 == null) {
            s.w("binding");
            a4Var6 = null;
        }
        lf.i iVar = new lf.i(lVarA, cVarA, relativeLayout, a4Var6.E.G, null, true, 16, null);
        this.hybridAdsManager = iVar;
        iVar.i();
        a4 a4Var7 = this.binding;
        if (a4Var7 == null) {
            s.w("binding");
        } else {
            a4Var = a4Var7;
        }
        a4Var.A.getViewTreeObserver().addOnGlobalLayoutListener(new d());
        lf.i.f44428h.a(cVar.a(lf.l.a.SHARE), c0675c.a(lf.c.a.SHARE));
    }
}
