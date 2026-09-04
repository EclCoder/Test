package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.activity.d0;
import androidx.activity.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.t0;
import androidx.lifecycle.b0;
import androidx.lifecycle.s1;
import androidx.lifecycle.t1;
import bm.r;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.TextSettingsFragment;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import tf.i5;
import uh.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J!\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/TextSettingsFragment;", "Lcom/hecorat/screenrecorder/free/videoeditor/d;", "Ltf/i5;", "<init>", "()V", "Lfl/g0;", "O", "K", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "L", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/i5;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "C", "y", "Luh/q0;", "c", "Lfl/k;", "J", "()Luh/q0;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextSettingsFragment extends com.hecorat.screenrecorder.free.videoeditor.d<i5> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.k viewModel = t0.b(this, l0.b(q0.class), new d(this), new e(null, this), new f(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            boolean z10 = charSequence == null || r.h0(charSequence);
            TextSettingsFragment.this.J().x().q(z10 ? TextSettingsFragment.this.getString(R.string.enter_text) : charSequence.toString());
            ((i5) TextSettingsFragment.this.w()).B.setImageResource(z10 ? R.drawable.ic_delete_white_24dp : R.drawable.ic_baseline_check_24);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            TextSettingsFragment.this.K();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            TextSettingsFragment.this.K();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends d0 {
        public c() {
            super(true);
        }

        @Override // androidx.activity.d0
        public void d() {
            TextSettingsFragment.this.J().y();
            androidx.navigation.fragment.a.a(TextSettingsFragment.this).L();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f23361a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final t1 invoke() {
            t1 viewModelStore = this.f23361a.requireActivity().getViewModelStore();
            s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tl.a f23362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f23363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.a aVar, Fragment fragment) {
            super(0);
            this.f23362a = aVar;
            this.f23363b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f23362a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f23363b.requireActivity().getDefaultViewModelCreationExtras();
            s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f23364a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f23364a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s1.c invoke() {
            s1.c defaultViewModelProviderFactory = this.f23364a.requireActivity().getDefaultViewModelProviderFactory();
            s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q0 J() {
        return (q0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        View currentFocus;
        InputMethodManager inputMethodManager;
        androidx.fragment.app.s activity = getActivity();
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null || (inputMethodManager = (InputMethodManager) androidx.core.content.a.getSystemService(requireContext(), InputMethodManager.class)) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static final void M(TextSettingsFragment textSettingsFragment) {
        textSettingsFragment.O();
    }

    public static final void N(TabLayout.g tab, int i10) {
        s.h(tab, "tab");
        if (i10 == 0) {
            tab.m(R.drawable.ic_baseline_font_download_24);
        } else if (i10 == 1) {
            tab.m(R.drawable.ic_baseline_palette_24);
        } else {
            if (i10 != 2) {
                return;
            }
            tab.m(R.drawable.ic_baseline_format_align_center_24);
        }
    }

    private final void O() {
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.a.getSystemService(requireContext(), InputMethodManager.class);
        ((i5) w()).C.requestFocus();
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(((i5) w()).C, 0);
        }
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void C() {
        if (J().s().f() == null) {
            return;
        }
        String string = ((i5) w()).C.getText().toString();
        if (r.h0(string)) {
            J().z();
        } else {
            J().A(string);
        }
        super.C();
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public i5 x(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        i5 i5VarY = i5.Y(layoutInflater, container, false);
        s.g(i5VarY, "inflate(...)");
        return i5VarY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0075  */
    @Override // com.hecorat.screenrecorder.free.videoeditor.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        boolean z10;
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ((i5) w()).C.postDelayed(new Runnable() { // from class: oh.n4
            @Override // java.lang.Runnable
            public final void run() {
                TextSettingsFragment.M(this.f48766a);
            }
        }, 100L);
        ((i5) w()).G.setAdapter(new ph.d0(this));
        ((i5) w()).G.setUserInputEnabled(false);
        new com.google.android.material.tabs.d(((i5) w()).E, ((i5) w()).G, new com.google.android.material.tabs.d.b() { // from class: oh.o4
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.g gVar, int i10) {
                TextSettingsFragment.N(gVar, i10);
            }
        }).a();
        ((i5) w()).E.h(new b());
        qh.j jVarT = J().t();
        if (jVarT != null) {
            z10 = jVarT.x();
        }
        ((i5) w()).E.setVisibility(z10 ? 8 : 0);
        ((i5) w()).G.setVisibility(z10 ? 8 : 0);
        qh.j jVarT2 = J().t();
        if (jVarT2 != null) {
            J().B(jVarT2);
            String strI = jVarT2.x() ? r.I(jVarT2.d(), "\n", " ", false, 4, null) : jVarT2.d();
            ((i5) w()).C.setText(strI);
            ((i5) w()).C.setSelection(strI.length());
            J().s().q(jVarT2.r());
            J().q().q(Integer.valueOf(jVarT2.p()));
            J().r().q(Float.valueOf(jVarT2.q()));
            J().p().q(jVarT2.o());
            J().w().q(Float.valueOf(jVarT2.u()));
            J().u().q(Float.valueOf(jVarT2.s()));
            J().v().q(Float.valueOf(jVarT2.t()));
        }
        EditText inputEt = ((i5) w()).C;
        s.g(inputEt, "inputEt");
        inputEt.addTextChangedListener(new a());
        i0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        b0 viewLifecycleOwner = getViewLifecycleOwner();
        s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.g(viewLifecycleOwner, new c());
    }

    @Override // com.hecorat.screenrecorder.free.videoeditor.d
    public void y() {
        J().y();
        super.y();
    }
}
