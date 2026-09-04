package lg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.MBridgeConstans;
import nh.j0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class l {
    public static /* synthetic */ void a(Runnable runnable, DialogInterface dialogInterface, int i10) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void b(a aVar, Activity activity, DialogInterface dialogInterface, int i10) {
        aVar.m(R.string.pref_audio_source, MBridgeConstans.API_REUQEST_CATEGORY_APP);
        j0.b(activity, R.string.no_sound_switched_toast);
    }

    public static void c(final Activity activity, final a aVar, String str, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.GeneralDialogTheme);
        builder.setNegativeButton(R.string.hint_got_it, new DialogInterface.OnClickListener() { // from class: lg.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                l.a(runnable, dialogInterface, i10);
            }
        });
        if (NotificationCompat.CATEGORY_CALL.equals(str) || "call_partial".equals(str)) {
            builder.setTitle(R.string.no_sound_call_dialog_title).setMessage(R.string.no_sound_call_dialog_message);
        } else {
            View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_no_sound_explainer, (ViewGroup) null);
            builder.setTitle(R.string.no_sound_dialog_title).setView(viewInflate);
            String strH = aVar.h(R.string.pref_audio_source, MBridgeConstans.ENDCARD_URL_TYPE_PL);
            if (MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(strH)) {
                viewInflate.findViewById(R.id.tip_section).setVisibility(8);
            }
            if ("1".equals(strH)) {
                builder.setPositiveButton(R.string.switch_to_internal_and_mic, new DialogInterface.OnClickListener() { // from class: lg.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        l.b(aVar, activity, dialogInterface, i10);
                    }
                });
            }
        }
        builder.show();
    }
}
