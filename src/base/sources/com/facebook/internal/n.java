package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000  2\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R$\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/facebook/internal/n;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "Lfl/g0;", "y", "(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V", "z", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "v", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onDestroyView", "a", "Landroid/app/Dialog;", "getInnerDialog", "()Landroid/app/Dialog;", "A", "(Landroid/app/Dialog;)V", "innerDialog", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Dialog innerDialog;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(n this$0, Bundle bundle, FacebookException facebookException) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.y(bundle, facebookException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(n this$0, Bundle bundle, FacebookException facebookException) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        this$0.z(bundle);
    }

    private final void y(Bundle values, FacebookException error) {
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        kotlin.jvm.internal.s.g(intent, "fragmentActivity.intent");
        activity.setResult(error == null ? -1 : 0, u0.p(intent, values, error));
        activity.finish();
    }

    private final void z(Bundle values) {
        androidx.fragment.app.s activity = getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        if (values == null) {
            values = new Bundle();
        }
        intent.putExtras(values);
        activity.setResult(-1, intent);
        activity.finish();
    }

    public final void A(Dialog dialog) {
        this.innerDialog = dialog;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.innerDialog instanceof j1) && isResumed()) {
            Dialog dialog = this.innerDialog;
            kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((j1) dialog).x();
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v();
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = this.innerDialog;
        if (dialog != null) {
            kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type android.app.Dialog");
            return dialog;
        }
        y(null, null);
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        kotlin.jvm.internal.s.g(dialogOnCreateDialog, "super.onCreateDialog(savedInstanceState)");
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = this.innerDialog;
        if (dialog instanceof j1) {
            kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type com.facebook.internal.WebDialog");
            ((j1) dialog).x();
        }
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
    public final void v() {
        androidx.fragment.app.s activity;
        j1 j1VarA;
        if (this.innerDialog == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            kotlin.jvm.internal.s.g(intent, "intent");
            Bundle bundleA = u0.A(intent);
            if (bundleA != null ? bundleA.getBoolean("is_fallback", false) : false) {
                String string = bundleA != null ? bundleA.getString("url") : null;
                if (e1.e0(string)) {
                    e1.l0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{com.facebook.h0.n()}, 1));
                kotlin.jvm.internal.s.g(str, "format(format, *args)");
                r.a aVar = r.f15349q;
                kotlin.jvm.internal.s.f(string, "null cannot be cast to non-null type kotlin.String");
                j1VarA = aVar.a(activity, string, str);
                j1VarA.B(new j1.d() { // from class: com.facebook.internal.m
                    @Override // com.facebook.internal.j1.d
                    public final void a(Bundle bundle, FacebookException facebookException) {
                        n.x(this.f15311a, bundle, facebookException);
                    }
                });
            } else {
                String string2 = bundleA != null ? bundleA.getString("action") : null;
                Bundle bundle = bundleA != null ? bundleA.getBundle("params") : null;
                if (e1.e0(string2)) {
                    e1.l0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                } else {
                    kotlin.jvm.internal.s.f(string2, "null cannot be cast to non-null type kotlin.String");
                    j1VarA = new j1.a(activity, string2, bundle).h(new j1.d() { // from class: com.facebook.internal.l
                        @Override // com.facebook.internal.j1.d
                        public final void a(Bundle bundle2, FacebookException facebookException) {
                            n.w(this.f15304a, bundle2, facebookException);
                        }
                    }).a();
                }
            }
            this.innerDialog = j1VarA;
        }
    }
}
