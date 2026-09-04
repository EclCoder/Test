package wf;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.hecorat.screenrecorder.free.R;
import kotlin.Metadata;
import nh.l0;
import tf.x1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lwf/l;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lfl/g0;", "onResume", "Ltf/x1;", "a", "Ltf/x1;", "u", "()Ltf/x1;", "w", "(Ltf/x1;)V", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends androidx.fragment.app.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public x1 binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(l lVar, kotlin.jvm.internal.i0 i0Var, kotlin.jvm.internal.g0 g0Var, DialogInterface dialogInterface, int i10) {
        l0 l0Var = l0.f47742a;
        androidx.fragment.app.s activity = lVar.getActivity();
        String string = lVar.getString(i0Var.f43593a);
        kotlin.jvm.internal.s.g(string, "getString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g0Var.f43588a ? l0Var.h() : "");
        sb2.append((Object) lVar.u().A.getText());
        l0Var.B(activity, string, sb2.toString());
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getActivity() != null) {
            final kotlin.jvm.internal.i0 i0Var = new kotlin.jvm.internal.i0();
            int i10 = R.string.feedback_hint;
            i0Var.f43593a = R.string.feedback_hint;
            final kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            g0Var.f43588a = true;
            Bundle arguments = getArguments();
            int i11 = R.string.feedback;
            if (arguments != null && arguments.getInt("key_feedback_type") == 2) {
                i0Var.f43593a = R.string.feedback_premium_issue_email_subject;
                g0Var.f43588a = true;
                i11 = R.string.feedback_premium_issue_title;
                i10 = R.string.feedback_premium_issue_hint;
            }
            w((x1) androidx.databinding.g.h(requireActivity().getLayoutInflater(), R.layout.dialog_feedback, null, false));
            u().A.setHint(i10);
            EditText feedbackEdt = u().A;
            kotlin.jvm.internal.s.g(feedbackEdt, "feedbackEdt");
            feedbackEdt.addTextChangedListener(new a());
            androidx.appcompat.app.c.a aVar = new androidx.appcompat.app.c.a(requireActivity(), R.style.GeneralDialogTheme);
            aVar.setView(u().B());
            aVar.m(i11);
            aVar.setPositiveButton(R.string.f22516ok, new DialogInterface.OnClickListener() { // from class: wf.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    l.v(this.f56232a, i0Var, g0Var, dialogInterface, i12);
                }
            });
            aVar.setNegativeButton(R.string.later, null);
            androidx.appcompat.app.c cVarCreate = aVar.create();
            if (cVarCreate != null) {
                return cVarCreate;
            }
        }
        throw new IllegalStateException("Activity cannot be null");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        ((androidx.appcompat.app.c) dialog).s(-1).setEnabled(u().A.getText().length() > 0);
    }

    public final x1 u() {
        x1 x1Var = this.binding;
        if (x1Var != null) {
            return x1Var;
        }
        kotlin.jvm.internal.s.w("binding");
        return null;
    }

    public final void w(x1 x1Var) {
        kotlin.jvm.internal.s.h(x1Var, "<set-?>");
        this.binding = x1Var;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Dialog dialog = l.this.getDialog();
            kotlin.jvm.internal.s.f(dialog, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
            Button buttonS = ((androidx.appcompat.app.c) dialog).s(-1);
            Integer numValueOf = editable != null ? Integer.valueOf(editable.length()) : null;
            kotlin.jvm.internal.s.e(numValueOf);
            buttonS.setEnabled(numValueOf.intValue() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
