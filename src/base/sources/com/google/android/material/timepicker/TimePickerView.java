package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import sb.g;
import sb.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip A;
    private final ClockHandView B;
    private final ClockFaceView C;
    private final MaterialButtonToggleGroup D;
    private final View.OnClickListener E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Chip f21529z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.F(TimePickerView.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.G(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ GestureDetector f21532a;

        c(GestureDetector gestureDetector) {
            this.f21532a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f21532a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d G(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void H() {
        Chip chip = this.f21529z;
        int i10 = g.f51774n0;
        chip.setTag(i10, 12);
        this.A.setTag(i10, 10);
        this.f21529z.setOnClickListener(this.E);
        this.A.setOnClickListener(this.E);
        this.f21529z.setAccessibilityClassName("android.view.View");
        this.A.setAccessibilityClassName("android.view.View");
    }

    private void I() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f21529z.setOnTouchListener(cVar);
        this.A.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.A.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E = new a();
        LayoutInflater.from(context).inflate(i.f51825x, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(g.f51767k);
        this.C = clockFaceView;
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(g.f51773n);
        this.D = materialButtonToggleGroup;
        materialButtonToggleGroup.E(new MaterialButtonToggleGroup.b() { // from class: com.google.android.material.timepicker.d
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f21541a.getClass();
            }
        });
        this.f21529z = (Chip) findViewById(g.f51779q);
        this.A = (Chip) findViewById(g.f51775o);
        this.B = (ClockHandView) findViewById(g.f51769l);
        clockFaceView.W(new ClockFaceView.c() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.timepicker.ClockFaceView.c
            public final void a() {
                this.f21542a.A.isChecked();
            }
        });
        I();
        H();
    }
}
