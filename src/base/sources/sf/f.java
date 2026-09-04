package sf;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.preference.DialogPreference;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.data.prefs.SeekBarDialogPreference;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0019\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lsf/f;", "Landroidx/preference/f;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "<init>", "()V", "", "B", "()Ljava/lang/String;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lfl/g0;", "v", "(Landroid/view/View;)V", "", "positiveResult", "x", "(Z)V", "Lcom/hecorat/screenrecorder/free/data/prefs/SeekBarDialogPreference;", "C", "()Lcom/hecorat/screenrecorder/free/data/prefs/SeekBarDialogPreference;", "Landroid/widget/SeekBar;", "seekBar", "", NotificationCompat.CATEGORY_PROGRESS, "fromUser", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "mStatusText", "j", "I", "mCurrentValue", CampaignEx.JSON_KEY_AD_K, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends androidx.preference.f implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private TextView mStatusText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int mCurrentValue;

    /* JADX INFO: renamed from: sf.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(String str) {
            f fVar = new f();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            fVar.setArguments(bundle);
            return fVar;
        }

        private Companion() {
        }
    }

    private final String B() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mCurrentValue + 5);
        sb2.append('%');
        return sb2.toString();
    }

    public SeekBarDialogPreference C() {
        DialogPreference dialogPreferenceT = super.t();
        SeekBarDialogPreference seekBarDialogPreference = dialogPreferenceT instanceof SeekBarDialogPreference ? (SeekBarDialogPreference) dialogPreferenceT : null;
        if (seekBarDialogPreference != null) {
            return seekBarDialogPreference;
        }
        throw new IllegalStateException("Preference is not a FontPreference");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (fromUser) {
            this.mCurrentValue = progress;
            TextView textView = this.mStatusText;
            if (textView != null) {
                textView.setText(B());
            }
        }
    }

    @Override // androidx.preference.f
    protected void v(View view) {
        s.h(view, "view");
        super.v(view);
        this.mCurrentValue = vl.a.b(C().getSbValue() * 100) - 5;
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.sb_logo_size);
        seekBar.setMax(20);
        seekBar.setProgress(this.mCurrentValue);
        seekBar.setOnSeekBarChangeListener(this);
        TextView textView = (TextView) view.findViewById(R.id.tv_size_value);
        this.mStatusText = textView;
        if (textView != null) {
            textView.setText(B());
        }
    }

    @Override // androidx.preference.f
    public void x(boolean positiveResult) {
        if (positiveResult) {
            float f10 = (this.mCurrentValue + 5) / 100.0f;
            SeekBarDialogPreference seekBarDialogPreferenceC = C();
            if (seekBarDialogPreferenceC.c(Float.valueOf(f10))) {
                seekBarDialogPreferenceC.V0(f10);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
