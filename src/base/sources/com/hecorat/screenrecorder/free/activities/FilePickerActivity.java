package com.hecorat.screenrecorder.free.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.Toolbar;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class FilePickerActivity extends androidx.appcompat.app.d implements AdapterView.OnItemSelectedListener {
    private jg.b x0() {
        return (jg.b) getSupportFragmentManager().j0(R.id.layout_content);
    }

    private void y0() {
        u0((Toolbar) findViewById(R.id.tool_bar));
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return;
        }
        aVarL0.t(true);
        aVarL0.A(true);
        aVarL0.v(false);
        aVarL0.u(true);
    }

    @Override // androidx.fragment.app.s, androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_file_picker);
        y0();
        getSupportFragmentManager().q().p(R.id.layout_content, new jg.d(), "file_picker_fm").g();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        jg.b bVarX0 = x0();
        if (bVarX0 == null || !bVarX0.w()) {
            return true;
        }
        ArrayList arrayListU = bVarX0.u();
        arrayListU.removeIf(new Predicate() { // from class: ff.i
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.isNull((String) obj);
            }
        });
        View viewInflate = getLayoutInflater().inflate(R.layout.spinner_layout, (ViewGroup) null);
        Spinner spinner = (Spinner) viewInflate.findViewById(R.id.spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.spinner_item, arrayListU);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(this);
        spinner.setSelection(bVarX0.s());
        androidx.appcompat.app.a aVarL0 = l0();
        if (aVarL0 == null) {
            return true;
        }
        aVarL0.r(viewInflate);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        x0().z(i10);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getOnBackPressedDispatcher().l();
        return true;
    }

    public void z0() {
        invalidateOptionsMenu();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
