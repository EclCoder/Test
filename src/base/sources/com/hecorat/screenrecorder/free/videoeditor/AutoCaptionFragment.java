package com.hecorat.screenrecorder.free.videoeditor;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import androidx.fragment.app.t0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.AutoCaptionFragment;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import fl.g0;
import fl.q;
import gl.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import nf.v;
import nf.w;
import nh.j0;
import oh.h1;
import oh.l2;
import oh.v1;
import tf.e3;
import uh.y;
import y3.d1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 D2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J+\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0003R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/AutoCaptionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/g0;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "K", "a0", "F", "Lnf/w;", "selected", "", "Lcom/hecorat/screenrecorder/free/videoeditor/j;", "b0", "(Lnf/w;)Ljava/util/List;", "f0", "(Lnf/w;)V", "preset", "O", "E", "", "L", "()Z", "Y", "X", "", "lang", "e0", "(Ljava/lang/String;)V", "c0", "N", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroyView", "Ltf/e3;", "a", "Ltf/e3;", "_binding", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", "I", "()Luh/y;", "activityViewModel", "Lcom/hecorat/screenrecorder/free/videoeditor/k;", "c", "Lcom/hecorat/screenrecorder/free/videoeditor/k;", "presetAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "currentLang", "e", "Z", "hasMadeChange", "J", "()Ltf/e3;", "binding", "f", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoCaptionFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public e3 _binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public k presetAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean hasMadeChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final fl.k activityViewModel = t0.b(this, l0.b(y.class), new d(this), new e(null, this), new f(this));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String currentLang = "";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* synthetic */ class b extends p implements Function1 {
        public b(Object obj) {
            super(1, obj, AutoCaptionFragment.class, "onPresetTap", "onPresetTap(Lcom/hecorat/screenrecorder/free/captions/CaptionStylePreset;)V", 0);
        }

        public final void b(w p10) {
            s.h(p10, "p0");
            ((AutoCaptionFragment) this.receiver).O(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((w) obj);
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23215a;

        public c(Function1 function) {
            s.h(function, "function");
            this.f23215a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23215a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23215a.invoke(obj);
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
    public static final class d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f23216a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23216a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23217a = aVar;
            this.f23218b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23217a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23218b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23219a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f23219a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23219a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    private final void E(w preset) {
        ng.d dVar = (ng.d) r.d0(I().k1());
        if (dVar == null) {
            return;
        }
        List listT0 = I().t0();
        if (listT0.isEmpty()) {
            return;
        }
        v vVar = v.f47646a;
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        I().X(vVar.a(contextRequireContext, listT0, preset, dVar.A(), dVar.p()));
    }

    private final void F() {
        this.presetAdapter = new k(new b(this));
        J().K.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        RecyclerView recyclerView = J().K;
        k kVar = this.presetAdapter;
        k kVar2 = null;
        if (kVar == null) {
            s.w("presetAdapter");
            kVar = null;
        }
        recyclerView.setAdapter(kVar);
        k kVar3 = this.presetAdapter;
        if (kVar3 == null) {
            s.w("presetAdapter");
        } else {
            kVar2 = kVar3;
        }
        kVar2.i(b0(I().v0()));
    }

    private final void G() {
        Context context = getContext();
        if (context != null && I().m1()) {
            new androidx.appcompat.app.c.a(context).m(R.string.caption_remove_all_confirm_title).e(R.string.caption_remove_all_confirm_message).setNegativeButton(android.R.string.cancel, null).setPositiveButton(R.string.caption_remove_all_confirm_action, new DialogInterface.OnClickListener() { // from class: oh.s0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AutoCaptionFragment.H(this.f48841a, dialogInterface, i10);
                }
            }).n();
        }
    }

    public static final void H(AutoCaptionFragment autoCaptionFragment, DialogInterface dialogInterface, int i10) {
        autoCaptionFragment.I().I1();
        androidx.fragment.app.s activity = autoCaptionFragment.getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        j0.b(autoCaptionFragment.getContext(), R.string.caption_remove_all);
        nf.l lVar = nf.l.f47604a;
        Context contextRequireContext = autoCaptionFragment.requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        lVar.B(contextRequireContext);
        autoCaptionFragment.K();
        autoCaptionFragment.a0();
    }

    private final y I() {
        return (y) this.activityViewModel.getValue();
    }

    private final e3 J() {
        e3 e3Var = this._binding;
        s.e(e3Var);
        return e3Var;
    }

    private final void K() {
        ImageButton imageButton;
        if (this.hasMadeChange) {
            return;
        }
        this.hasMadeChange = true;
        e3 e3Var = this._binding;
        if (e3Var == null || (imageButton = e3Var.D) == null) {
            return;
        }
        imageButton.setVisibility(8);
    }

    private final boolean L() {
        am.g<qh.j> gVarO = am.j.o(r.T(I().i1()), new Function1() { // from class: oh.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AutoCaptionFragment.M((qh.j) obj));
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (qh.j jVar : gVarO) {
            q qVarA = fl.w.a(Long.valueOf(jVar.c()), bm.r.V0(bm.r.I(jVar.d(), "\n", " ", false, 4, null)).toString());
            linkedHashMap.put(qVarA.h(), qVarA.i());
        }
        boolean z10 = false;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        y yVarI = I();
        List<nf.m> listT0 = I().t0();
        ArrayList arrayList = new ArrayList(r.v(listT0, 10));
        for (nf.m mVarB : listT0) {
            String str = (String) linkedHashMap.get(Long.valueOf(mVarB.d()));
            if (str != null && !bm.r.h0(str) && !s.c(str, mVarB.e())) {
                mVarB = nf.m.b(mVarB, str, 0L, 0L, 6, null);
                z10 = true;
            }
            arrayList.add(mVarB);
        }
        yVarI.W1(arrayList);
        return z10;
    }

    public static final boolean M(qh.j it) {
        s.h(it, "it");
        return it.x();
    }

    private final void N() {
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        a0();
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(w preset) {
        I().X1(preset);
        f0(preset);
        L();
        E(preset);
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.invalidateOptionsMenu();
        }
        nf.l lVar = nf.l.f47604a;
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        lVar.z(contextRequireContext, preset);
        K();
    }

    public static final void P(AutoCaptionFragment autoCaptionFragment) {
        d1 d1VarS = androidx.navigation.fragment.a.a(autoCaptionFragment).s();
        if (d1VarS != null) {
            autoCaptionFragment.I().r1(d1VarS.p());
        }
    }

    public static final g0 Q(AutoCaptionFragment autoCaptionFragment, com.google.android.exoplayer2.k kVar) {
        autoCaptionFragment.J().I.setPlayer(kVar);
        return g0.f38750a;
    }

    public static final void R(AutoCaptionFragment autoCaptionFragment, View view) {
        androidx.navigation.fragment.a.a(autoCaptionFragment).L();
    }

    public static final void S(AutoCaptionFragment autoCaptionFragment, View view) {
        androidx.navigation.fragment.a.a(autoCaptionFragment).L();
    }

    public static final void T(AutoCaptionFragment autoCaptionFragment, View view) {
        autoCaptionFragment.Y();
    }

    public static final void U(AutoCaptionFragment autoCaptionFragment, View view) {
        autoCaptionFragment.Y();
    }

    public static final void V(AutoCaptionFragment autoCaptionFragment, View view) {
        autoCaptionFragment.X();
    }

    public static final void W(AutoCaptionFragment autoCaptionFragment, View view) {
        autoCaptionFragment.G();
    }

    private final void X() {
        if (!I().m1()) {
            j0.b(getContext(), R.string.caption_edit_list_empty);
            return;
        }
        f0 childFragmentManager = getChildFragmentManager();
        s.g(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.k0("EditCaptionsBottomSheet") != null) {
            return;
        }
        new v1().show(childFragmentManager, "EditCaptionsBottomSheet");
    }

    private final void Y() {
        f0 supportFragmentManager;
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || supportFragmentManager.k0("LanguagePickerDialogFragment") != null) {
            return;
        }
        l2 l2Var = new l2();
        l2Var.C(new Function1() { // from class: oh.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoCaptionFragment.Z(this.f48695a, (String) obj);
            }
        });
        l2Var.show(supportFragmentManager, "LanguagePickerDialogFragment");
    }

    public static final g0 Z(AutoCaptionFragment autoCaptionFragment, String code) {
        s.h(code, "code");
        autoCaptionFragment.e0(code);
        return g0.f38750a;
    }

    private final void a0() {
        String upperCase;
        boolean zM1 = I().m1();
        J().G.setVisibility(zM1 ? 8 : 0);
        J().K.setVisibility(zM1 ? 0 : 8);
        J().C.setVisibility(zM1 ? 0 : 8);
        if (zM1) {
            boolean zC = s.c(this.currentLang, "");
            Button button = J().H;
            if (zC) {
                upperCase = "AUTO";
            } else {
                String str = this.currentLang;
                Locale ROOT = Locale.ROOT;
                s.g(ROOT, "ROOT");
                upperCase = str.toUpperCase(ROOT);
                s.g(upperCase, "toUpperCase(...)");
            }
            button.setText(upperCase);
            String string = zC ? getString(R.string.caption_lang_auto) : nf.r.f47620a.a(this.currentLang);
            s.e(string);
            androidx.appcompat.widget.t0.a(J().H, string);
            f0(I().v0());
        }
    }

    private final List b0(w selected) {
        w[] wVarArrValues = w.values();
        ArrayList arrayList = new ArrayList(wVarArrValues.length);
        int length = wVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            w wVar = wVarArrValues[i10];
            arrayList.add(new j(wVar, wVar == selected));
        }
        return arrayList;
    }

    private final void c0() {
        f0 supportFragmentManager;
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || supportFragmentManager.k0("CaptionProcessingFragment") != null) {
            return;
        }
        h1 h1Var = new h1();
        h1Var.L(new tl.a() { // from class: oh.j0
            @Override // tl.a
            public final Object invoke() {
                return AutoCaptionFragment.d0(this.f48702a);
            }
        });
        h1Var.show(supportFragmentManager, "CaptionProcessingFragment");
    }

    public static final g0 d0(AutoCaptionFragment autoCaptionFragment) {
        autoCaptionFragment.N();
        return g0.f38750a;
    }

    private final void e0(String lang) {
        ng.d dVar = (ng.d) r.d0(I().k1());
        if (dVar != null && dVar.o()) {
            this.currentLang = lang;
            I().C1();
            I().e2(lang);
            c0();
            return;
        }
        nf.l lVar = nf.l.f47604a;
        Context contextRequireContext = requireContext();
        s.g(contextRequireContext, "requireContext(...)");
        lVar.E(contextRequireContext, lang, nf.p.NO_AUDIO);
        j0.b(getContext(), R.string.caption_error_no_audio_track);
    }

    private final void f0(w selected) {
        k kVar = this.presetAdapter;
        if (kVar == null) {
            s.w("presetAdapter");
            kVar = null;
        }
        kVar.i(b0(selected));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.h(inflater, "inflater");
        this._binding = e3.Y(inflater, container, false);
        View viewB = J().B();
        s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        I().C1();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (I().m1() && !I().t0().isEmpty()) {
            boolean zL = L();
            E(I().v0());
            if (zL) {
                K();
            }
        }
        a0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!nh.l0.o()) {
            lf.i.f44428h.a(lf.l.f44461f.a(lf.l.a.CAPTION), lf.c.f44397g.a(lf.c.a.CAPTION));
        }
        view.post(new Runnable() { // from class: oh.k0
            @Override // java.lang.Runnable
            public final void run() {
                AutoCaptionFragment.P(this.f48708a);
            }
        });
        I().W0().j(getViewLifecycleOwner(), new c(new Function1() { // from class: oh.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutoCaptionFragment.Q(this.f48713a, (com.google.android.exoplayer2.k) obj);
            }
        }));
        J().D.setOnClickListener(new View.OnClickListener() { // from class: oh.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutoCaptionFragment.R(this.f48730a, view2);
            }
        });
        J().E.setOnClickListener(new View.OnClickListener() { // from class: oh.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutoCaptionFragment.S(this.f48763a, view2);
            }
        });
        J().G.setOnClickListener(new View.OnClickListener() { // from class: oh.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutoCaptionFragment.T(this.f48768a, view2);
            }
        });
        J().H.setOnClickListener(new View.OnClickListener() { // from class: oh.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutoCaptionFragment.U(this.f48776a, view2);
            }
        });
        J().F.setOnClickListener(new View.OnClickListener() { // from class: oh.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutoCaptionFragment.V(this.f48782a, view2);
            }
        });
        androidx.appcompat.widget.t0.a(J().F, getString(R.string.caption_edit));
        androidx.appcompat.widget.t0.a(J().J, getString(R.string.caption_remove_all));
        J().J.setOnClickListener(new View.OnClickListener() { // from class: oh.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AutoCaptionFragment.W(this.f48828a, view2);
            }
        });
        F();
        a0();
    }
}
