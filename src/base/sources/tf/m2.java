package tf;

import android.view.View;
import android.widget.RadioGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m2 extends androidx.databinding.p {
    public final MaterialRadioButton A;
    public final MaterialRadioButton B;
    public final RadioGroup C;

    protected m2(Object obj, View view, int i10, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, RadioGroup radioGroup) {
        super(obj, view, i10);
        this.A = materialRadioButton;
        this.B = materialRadioButton2;
        this.C = radioGroup;
    }
}
