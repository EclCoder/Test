package wf;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class w extends androidx.fragment.app.m {
    public static /* synthetic */ void u(w wVar, DialogInterface dialogInterface, int i10) {
        wVar.x(true);
        wVar.dismiss();
    }

    public static /* synthetic */ void w(w wVar, DialogInterface dialogInterface, int i10) {
        wVar.x(false);
        wVar.dismiss();
    }

    private void x(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("result", z10);
        getParentFragmentManager().y1("SdcardWarningDialog", bundle);
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        getFragmentManager().q().n(this).h();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_msg_sdcard_warning, (ViewGroup) null);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox);
        ((TextView) viewInflate.findViewById(R.id.tv_msg)).setText(getString(R.string.dialog_sdcard_warning_msg, getString(R.string.app_name)));
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(getActivity(), R.style.GeneralDialogTheme).setTitle(R.string.warning).setView(viewInflate).setIcon(R.drawable.ic_app_icon).setPositiveButton(R.string.ok_understand, new DialogInterface.OnClickListener() { // from class: wf.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                w.u(this.f56258a, dialogInterface, i10);
            }
        }).setNeutralButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: wf.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                w.w(this.f56259a, dialogInterface, i10);
            }
        }).create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wf.u
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                alertDialogCreate.getButton(-1).setEnabled(false);
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wf.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                alertDialogCreate.getButton(-1).setEnabled(z10);
            }
        });
        return alertDialogCreate;
    }
}
