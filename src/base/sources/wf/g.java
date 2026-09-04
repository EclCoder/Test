package wf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g extends DialogFragment {
    public static /* synthetic */ void a(lg.g gVar, DialogInterface dialogInterface, int i10) {
        gVar.w(0);
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void b(lg.g gVar, DialogInterface dialogInterface, int i10) {
        gVar.k(0);
        dialogInterface.dismiss();
    }

    public static g c(int i10, int i11, int i12, int i13, int i14, int i15, String str, boolean z10) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i10);
        bundle.putInt("msg_id", i11);
        bundle.putInt("positive_act_id", i12);
        bundle.putInt("navigate_act_id", i13);
        bundle.putInt("neutral_act_id", i14);
        bundle.putInt("icon_id", i15);
        bundle.putString("dialog_type", str);
        bundle.putBoolean("in_dialog_activity", z10);
        gVar.setArguments(bundle);
        return gVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getArguments().getBoolean("in_dialog_activity")) {
            getActivity().finish();
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i10 = getArguments().getInt("title_id");
        int i11 = getArguments().getInt("msg_id");
        int i12 = getArguments().getInt("icon_id");
        int i13 = getArguments().getInt("positive_act_id");
        int i14 = getArguments().getInt("navigate_act_id");
        getArguments().getInt("neutral_act_id");
        String string = getArguments().getString("dialog_type");
        final lg.g gVar = (lg.g) getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(i10);
        builder.setIcon(i12);
        builder.setMessage(getString(i11));
        if (!"got_it".equals(string)) {
            builder.setNegativeButton(i14, new DialogInterface.OnClickListener() { // from class: wf.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    g.a(gVar, dialogInterface, i15);
                }
            });
        }
        builder.setPositiveButton(i13, new DialogInterface.OnClickListener() { // from class: wf.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                g.b(gVar, dialogInterface, i15);
            }
        });
        return builder.create();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
