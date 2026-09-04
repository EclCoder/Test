package oh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.google.ads.mediation.admob.Mvp.IAoPeRfJn;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Loh/s2;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ltf/i2;", "a", "Ltf/i2;", "binding", "Luh/y;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lfl/k;", "x", "()Luh/y;", "viewModel", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s2 extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private tf.i2 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fl.k viewModel = androidx.fragment.app.t0.b(this, kotlin.jvm.internal.l0.b(uh.y.class), new b(this), new c(null, this), new d(this));

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48846a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f48846a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.t1 invoke() {
            androidx.lifecycle.t1 viewModelStore = this.f48846a.requireActivity().getViewModelStore();
            kotlin.jvm.internal.s.g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ tl.a f48847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f48848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tl.a aVar, Fragment fragment) {
            super(0);
            this.f48847a = aVar;
            this.f48848b = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final q1.a invoke() {
            q1.a aVar;
            tl.a aVar2 = this.f48847a;
            if (aVar2 != null && (aVar = (q1.a) aVar2.invoke()) != null) {
                return aVar;
            }
            q1.a defaultViewModelCreationExtras = this.f48848b.requireActivity().getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.s.g(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends kotlin.jvm.internal.t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f48849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f48849a = fragment;
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.s1.c invoke() {
            androidx.lifecycle.s1.c defaultViewModelProviderFactory = this.f48849a.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.s.g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(s2 s2Var, View view) {
        s2Var.dismiss();
        s2Var.x().v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh.y x() {
        return (uh.y) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(s2 s2Var, TabLayout.g tab, int i10) {
        kotlin.jvm.internal.s.h(tab, "tab");
        if (i10 == 0) {
            tab.p(s2Var.getString(R.string.video));
        } else {
            if (i10 != 1) {
                return;
            }
            tab.p(s2Var.getString(R.string.GIF));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(s2 s2Var, View view) {
        s2Var.dismiss();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(activity);
            tf.i2 i2VarY = tf.i2.Y(getLayoutInflater());
            this.binding = i2VarY;
            tf.i2 i2Var = null;
            if (i2VarY == null) {
                kotlin.jvm.internal.s.w("binding");
                i2VarY = null;
            }
            i2VarY.F.setAdapter(new ph.c0(this));
            tf.i2 i2Var2 = this.binding;
            if (i2Var2 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var2 = null;
            }
            i2Var2.F.setUserInputEnabled(false);
            tf.i2 i2Var3 = this.binding;
            if (i2Var3 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var3 = null;
            }
            TabLayout tabLayout = i2Var3.C;
            tf.i2 i2Var4 = this.binding;
            if (i2Var4 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var4 = null;
            }
            new com.google.android.material.tabs.d(tabLayout, i2Var4.F, new com.google.android.material.tabs.d.b() { // from class: oh.p2
                @Override // com.google.android.material.tabs.d.b
                public final void a(TabLayout.g gVar, int i10) {
                    s2.y(this.f48778a, gVar, i10);
                }
            }).a();
            boolean zC = kotlin.jvm.internal.s.c(x().U0().f(), "GIF");
            tf.i2 i2Var5 = this.binding;
            if (i2Var5 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var5 = null;
            }
            TabLayout.g gVarZ = i2Var5.C.z(zC ? 1 : 0);
            if (gVarZ != null) {
                gVarZ.l();
            }
            tf.i2 i2Var6 = this.binding;
            if (i2Var6 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var6 = null;
            }
            i2Var6.C.h(new a());
            tf.i2 i2Var7 = this.binding;
            if (i2Var7 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var7 = null;
            }
            i2Var7.D.setOnClickListener(new View.OnClickListener() { // from class: oh.q2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s2.z(this.f48810a, view);
                }
            });
            tf.i2 i2Var8 = this.binding;
            if (i2Var8 == null) {
                kotlin.jvm.internal.s.w("binding");
                i2Var8 = null;
            }
            i2Var8.B.setOnClickListener(new View.OnClickListener() { // from class: oh.r2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s2.A(this.f48830a, view);
                }
            });
            tf.i2 i2Var9 = this.binding;
            if (i2Var9 == null) {
                kotlin.jvm.internal.s.w("binding");
            } else {
                i2Var = i2Var9;
            }
            aVar.setView(i2Var.B());
            androidx.appcompat.app.c cVarCreate = aVar.create();
            if (cVarCreate != null) {
                Window window = cVarCreate.getWindow();
                if (window != null) {
                    window.requestFeature(1);
                }
                if (window != null) {
                    window.setBackgroundDrawableResource(R.color.transparent);
                }
                return cVarCreate;
            }
        }
        throw new IllegalStateException("Activity cannot be null");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, IAoPeRfJn.sFRAEFgvabGU);
        Dialog dialog = getDialog();
        kotlin.jvm.internal.s.e(dialog);
        Window window = dialog.getWindow();
        kotlin.jvm.internal.s.e(window);
        window.setGravity(55);
        tf.i2 i2Var = this.binding;
        tf.i2 i2Var2 = null;
        if (i2Var == null) {
            kotlin.jvm.internal.s.w("binding");
            i2Var = null;
        }
        i2Var.a0(x());
        tf.i2 i2Var3 = this.binding;
        if (i2Var3 == null) {
            kotlin.jvm.internal.s.w("binding");
        } else {
            i2Var2 = i2Var3;
        }
        i2Var2.S(this);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements TabLayout.d {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            if (gVar == null || gVar.g() != 0) {
                s2.this.x().U0().q("GIF");
                return;
            }
            androidx.lifecycle.p0 p0VarU0 = s2.this.x().U0();
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            Object objF = s2.this.x().d1().f();
            kotlin.jvm.internal.s.e(objF);
            String str = String.format("%sp", Arrays.copyOf(new Object[]{objF}, 1));
            kotlin.jvm.internal.s.g(str, "format(...)");
            p0VarU0.q(str);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }
}
