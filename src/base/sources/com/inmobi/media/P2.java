package com.inmobi.media;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class P2 {
    public static HashMap a() {
        String networkOperatorName;
        HashMap map = new HashMap();
        Context context = Xi.f26021a;
        if (context == null) {
            return map;
        }
        int cellOperatorFlag = AbstractC3229pj.a().getCellOperatorFlag();
        boolean z10 = (cellOperatorFlag & 2) == 2;
        boolean z11 = (cellOperatorFlag & 1) == 1;
        N2 n10 = new N2();
        Object systemService = context.getSystemService("phone");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        if (!z10) {
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            n10.f25299a = iArrA[0];
            n10.f25300b = iArrA[1];
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (networkCountryIso != null) {
                Locale ENGLISH = Locale.ENGLISH;
                kotlin.jvm.internal.s.g(ENGLISH, "ENGLISH");
                String lowerCase = networkCountryIso.toLowerCase(ENGLISH);
                kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
                n10.f25303e = lowerCase;
            }
        }
        if (!z11) {
            int[] iArrA2 = a(telephonyManager.getSimOperator());
            n10.f25301c = iArrA2[0];
            n10.f25302d = iArrA2[1];
        }
        String strB = n10.b();
        if (strB != null) {
            map.put("s-ho", strB);
        }
        String strA = n10.a();
        if (strA != null) {
            map.put("s-co", strA);
        }
        String str = n10.f25303e;
        if (str != null) {
            map.put("s-iso", str);
        }
        B5.f24500a.getClass();
        kotlin.jvm.internal.s.h(context, "context");
        Object systemService2 = context.getSystemService("phone");
        TelephonyManager telephonyManager2 = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
        if (telephonyManager2 == null || (networkOperatorName = telephonyManager2.getNetworkOperatorName()) == null) {
            networkOperatorName = "";
        }
        map.put("s-cn", networkOperatorName);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    public static HashMap b() {
        Context context;
        CellLocation cellLocation;
        int networkType;
        int networkType2;
        C3484zh c3484zh = AbstractC3229pj.f27269a;
        O2 o10 = null;
        if ((Xi.b() == null || AbstractC3229pj.a().isConnectedCellTowerEnabled()) && d() && e() && (context = Xi.f26021a) != null) {
            Object systemService = context.getSystemService("phone");
            kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int[] iArrA = a(telephonyManager.getNetworkOperator());
            String strValueOf = String.valueOf(iArrA[0]);
            String strValueOf2 = String.valueOf(iArrA[1]);
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo != null) {
                int size = allCellInfo.size();
                CellInfo cellInfo = null;
                for (int i10 = 0; i10 < size; i10++) {
                    cellInfo = allCellInfo.get(i10);
                    if (cellInfo.isRegistered()) {
                        break;
                    }
                }
                if (cellInfo != null) {
                    o10 = new O2(cellInfo, strValueOf, strValueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType());
                } else {
                    cellLocation = telephonyManager.getCellLocation();
                    if (cellLocation != null && iArrA[0] != -1) {
                        o10 = new O2();
                        if (cellLocation instanceof CdmaCellLocation) {
                            o10.f25381b = Integer.MAX_VALUE;
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType2 = telephonyManager.getDataNetworkType();
                            } else {
                                networkType2 = telephonyManager.getNetworkType();
                            }
                            o10.f25382c = networkType2;
                            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                            o10.f25380a = O2.a(strValueOf, cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId(), cdmaCellLocation.getBaseStationId());
                        } else {
                            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                            o10.f25381b = Integer.MAX_VALUE;
                            if (Build.VERSION.SDK_INT >= 30) {
                                networkType = telephonyManager.getDataNetworkType();
                            } else {
                                networkType = telephonyManager.getNetworkType();
                            }
                            o10.f25382c = networkType;
                            o10.f25380a = O2.a(strValueOf, strValueOf2, gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc(), Integer.MAX_VALUE);
                        }
                    }
                }
            } else {
                cellLocation = telephonyManager.getCellLocation();
                if (cellLocation != null) {
                    o10 = new O2();
                    if (cellLocation instanceof CdmaCellLocation) {
                        o10.f25381b = Integer.MAX_VALUE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            networkType2 = telephonyManager.getDataNetworkType();
                        } else {
                            networkType2 = telephonyManager.getNetworkType();
                        }
                        o10.f25382c = networkType2;
                        CdmaCellLocation cdmaCellLocation2 = (CdmaCellLocation) cellLocation;
                        o10.f25380a = O2.a(strValueOf, cdmaCellLocation2.getSystemId(), cdmaCellLocation2.getNetworkId(), cdmaCellLocation2.getBaseStationId());
                    } else {
                        GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                        o10.f25381b = Integer.MAX_VALUE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            networkType = telephonyManager.getDataNetworkType();
                        } else {
                            networkType = telephonyManager.getNetworkType();
                        }
                        o10.f25382c = networkType;
                        o10.f25380a = O2.a(strValueOf, strValueOf2, gsmCellLocation2.getLac(), gsmCellLocation2.getCid(), gsmCellLocation2.getPsc(), Integer.MAX_VALUE);
                    }
                }
            }
        }
        HashMap map = new HashMap();
        if (o10 != null) {
            map.put("c-sc", o10.a().toString());
        }
        return map;
    }

    public static HashMap c() {
        ArrayList arrayList;
        Context context;
        if (Xi.d() && d() && e()) {
            C3484zh c3484zh = AbstractC3229pj.f27269a;
            if ((Xi.b() == null || AbstractC3229pj.a().isVisibleCellTowerEnabled()) && (context = Xi.f26021a) != null) {
                Object systemService = context.getSystemService("phone");
                kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                ArrayList arrayList2 = new ArrayList();
                int[] iArrA = a(telephonyManager.getNetworkOperator());
                String strValueOf = String.valueOf(iArrA[0]);
                String strValueOf2 = String.valueOf(iArrA[1]);
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo != null) {
                    for (CellInfo cellInfo : allCellInfo) {
                        if (!cellInfo.isRegistered()) {
                            arrayList2.add(new O2(cellInfo, strValueOf, strValueOf2, Build.VERSION.SDK_INT >= 30 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType()));
                        }
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = new ArrayList();
            }
        } else {
            arrayList = new ArrayList();
        }
        HashMap map = new HashMap();
        if (!arrayList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(((O2) arrayList.get(arrayList.size() - 1)).a());
            map.put("v-sc", jSONArray.toString());
        }
        return map;
    }

    public static boolean d() {
        if (!Xi.d()) {
            return false;
        }
        boolean zA = Sf.a(Xi.f26021a, "android.permission.READ_PHONE_STATE");
        boolean zA2 = Sf.a(Xi.f26021a, "android.permission.ACCESS_FINE_LOCATION");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 29) {
            if (!zA2) {
                kotlin.jvm.internal.s.g("P2", "TAG");
            }
            return zA2;
        }
        if (i10 >= 30) {
            if (!zA2 || !zA) {
                kotlin.jvm.internal.s.g("P2", "TAG");
            }
            return zA2 && zA;
        }
        boolean zA3 = Sf.a(Xi.f26021a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zA3 && !zA2) {
            kotlin.jvm.internal.s.g("P2", "TAG");
        }
        return zA3 || zA2;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT < 28) {
            return true;
        }
        Context context = Xi.f26021a;
        Object systemService = context != null ? context.getSystemService("location") : null;
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager != null && locationManager.isLocationEnabled();
    }

    public static int[] a(String str) {
        int[] iArr = {-1, -1};
        if (str != null && !kotlin.jvm.internal.s.c("", str)) {
            try {
                String strSubstring = str.substring(0, 3);
                kotlin.jvm.internal.s.g(strSubstring, "substring(...)");
                int i10 = Integer.parseInt(strSubstring);
                String strSubstring2 = str.substring(3);
                kotlin.jvm.internal.s.g(strSubstring2, "substring(...)");
                int i11 = Integer.parseInt(strSubstring2);
                iArr[0] = i10;
                iArr[1] = i11;
            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            }
        }
        return iArr;
    }
}
