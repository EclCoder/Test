package com.hecorat.screenrecorder.free.activities.main_setting_drawer;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class HelpActivity extends ff.b {
    @Override // ff.b, androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_help);
        y0(findViewById(R.id.root_view));
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        u0(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: hf.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40344a.onBackPressed();
            }
        });
        setTitle(getString(R.string.faq));
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 != null) {
            aVarL0.t(true);
        }
        int intExtra = getIntent().getIntExtra("question_id", 0);
        int i10 = intExtra / 100;
        int i11 = intExtra % 100;
        TextView textView = (TextView) findViewById(R.id.tv_question);
        TextView textView2 = (TextView) findViewById(R.id.tv_answer);
        TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(R.array.faq_questions);
        int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
        if (resourceId > 0) {
            String[] stringArray = getResources().getStringArray(resourceId);
            if (i11 < stringArray.length) {
                textView.setText(stringArray[i11]);
            }
        }
        typedArrayObtainTypedArray.recycle();
        TypedArray typedArrayObtainTypedArray2 = getResources().obtainTypedArray(R.array.faq_answers);
        int resourceId2 = typedArrayObtainTypedArray2.getResourceId(i10, 0);
        if (resourceId2 > 0) {
            CharSequence[] textArray = getResources().getTextArray(resourceId2);
            if (i11 < textArray.length) {
                textView2.setText(textArray[i11]);
            }
        }
        typedArrayObtainTypedArray2.recycle();
    }
}
