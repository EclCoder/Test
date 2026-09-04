package com.google.android.gms.internal.play_billing;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzht {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzc(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof zzfp) {
                sb2.append(": \"");
                sb2.append(zzio.zza(((zzfp) obj).zzm()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof zzgp) {
                sb2.append(" {");
                zzd((zzgp) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i12 = i10 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            zzb(sb2, i12, "key", entry.getKey());
            zzb(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb2.append("\n");
            zzc(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < strReplace2.length(); i13++) {
            char cCharAt2 = strReplace2.charAt(i13);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = zzio.zza(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb2.append(strReplace);
                sb2.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z12 = true;
                } else if (cCharAt2 == '\'') {
                    z11 = true;
                } else if (cCharAt2 == '\\') {
                    z10 = true;
                }
            }
        }
        if (z10) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z11 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z12) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    private static void zzd(zzhr zzhrVar, StringBuilder sb2, int i10) {
        int i11;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzhrVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), zzgp.zzx(method2, zzhrVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), zzgp.zzx(method, zzhrVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzx = zzgp.zzx(method4, zzhrVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) zzgp.zzx(method5, zzhrVar, new Object[0])).booleanValue();
                    } else if (objZzx instanceof Boolean) {
                        if (((Boolean) objZzx).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objZzx instanceof Integer) {
                        if (((Integer) objZzx).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objZzx instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objZzx).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objZzx instanceof Double)) {
                        if (objZzx instanceof String) {
                            zEquals = objZzx.equals("");
                        } else if (objZzx instanceof zzfp) {
                            zEquals = objZzx.equals(zzfp.zza);
                        } else if (!(objZzx instanceof zzhr) ? !((objZzx instanceof Enum) && ((Enum) objZzx).ordinal() == 0) : objZzx != ((zzhr) objZzx).zzl()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objZzx).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        zzb(sb2, i10, strSubstring, objZzx);
                    }
                }
            }
            i11 = 3;
        }
        if (zzhrVar instanceof zzgm) {
            Iterator itZzf = ((zzgm) zzhrVar).zzb.zzf();
            if (itZzf.hasNext()) {
                throw null;
            }
        }
        zzir zzirVar = ((zzgp) zzhrVar).zzc;
        if (zzirVar != null) {
            zzirVar.zzi(sb2, i10);
        }
    }

    static String zza(zzhr zzhrVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dmHT.qVJcoANjt);
        sb2.append(str);
        zzd(zzhrVar, sb2, 0);
        return sb2.toString();
    }
}
