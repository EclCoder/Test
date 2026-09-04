package wf;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.widget.ColorPickerPanelView;
import com.hecorat.screenrecorder.free.widget.ColorPickerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c extends androidx.appcompat.app.c implements ColorPickerView.a, View.OnClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorPickerView f56192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorPickerPanelView f56193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorPickerPanelView f56194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a f56195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Context f56196l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(int i10);
    }

    public c(Context context, int i10, int i11) {
        super(context);
        this.f56196l = context;
        D(i10, i11);
    }

    private void D(int i10, int i11) {
        getWindow().setFormat(1);
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.dialog_color_picker, (ViewGroup) null);
        w(viewInflate);
        setTitle(this.f56196l.getString(i11));
        v(-1, this.f56196l.getString(android.R.string.ok), new DialogInterface.OnClickListener() { // from class: wf.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                c.y(this.f56189a, dialogInterface, i12);
            }
        });
        v(-2, this.f56196l.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: wf.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                this.f56190a.dismiss();
            }
        });
        this.f56192h = (ColorPickerView) viewInflate.findViewById(R.id.color_picker_view);
        this.f56193i = (ColorPickerPanelView) viewInflate.findViewById(R.id.old_color_panel);
        this.f56194j = (ColorPickerPanelView) viewInflate.findViewById(R.id.new_color_panel);
        this.f56193i.setOnClickListener(this);
        this.f56194j.setOnClickListener(this);
        this.f56192h.setOnColorChangedListener(this);
        this.f56193i.setColor(i10);
        this.f56192h.q(i10, true);
    }

    public static /* synthetic */ void y(c cVar, DialogInterface dialogInterface, int i10) {
        a aVar = cVar.f56195k;
        if (aVar != null) {
            aVar.a(cVar.f56194j.getColor());
        }
        cVar.dismiss();
    }

    public void A(boolean z10) {
        this.f56192h.setAlphaSliderVisible(z10);
    }

    public void B(int i10) {
        this.f56193i.setColor(i10);
    }

    public void C(a aVar) {
        this.f56195k = aVar;
    }

    @Override // com.hecorat.screenrecorder.free.widget.ColorPickerView.a
    public void a(int i10) {
        this.f56194j.setColor(i10);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        if (view.getId() == R.id.new_color_panel && (aVar = this.f56195k) != null) {
            aVar.a(this.f56194j.getColor());
        }
        dismiss();
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f56193i.setColor(bundle.getInt("old_color"));
        this.f56192h.q(bundle.getInt("new_color"), true);
    }

    @Override // androidx.activity.w, android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.putInt("old_color", this.f56193i.getColor());
        bundleOnSaveInstanceState.putInt("new_color", this.f56194j.getColor());
        return bundleOnSaveInstanceState;
    }

    public int z() {
        return this.f56192h.getColor();
    }
}
