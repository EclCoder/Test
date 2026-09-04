package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzub {
    private static final zzgwm zza = zzgwm.zzj(12);

    /* JADX WARN: Code duplicated, block: B:117:0x017d  */
    /* JADX WARN: Code duplicated, block: B:127:0x019a A[RETURN] */
    public static zzgwm zza(AudioDeviceInfo audioDeviceInfo) {
        int type;
        zzgwm zzgwmVarZzb;
        zzgwm zzgwmVarZzi;
        int speakerLayoutChannelMask;
        if (!zztu.zza(audioDeviceInfo.getType())) {
            if (audioDeviceInfo.getType() == 1) {
                return zzgwm.zzj(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return zzgwm.zzj(Integer.valueOf(speakerLayoutChannelMask));
                }
                zzeg.zzc("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return zza;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31 && audioDeviceInfo.getType() == 10) {
                zzgwm zzgwmVarZzb2 = zzb(audioDeviceInfo);
                if (!zzgwmVarZzb2.isEmpty()) {
                    return zzgwmVarZzb2;
                }
                zzgwm zzgwmVarZza = zzqq.zza(audioDeviceInfo.getAudioDescriptors());
                if (!zzgwmVarZza.isEmpty()) {
                    return zzgwmVarZza;
                }
            } else if (i10 >= 31) {
                int type2 = audioDeviceInfo.getType();
                if (i10 >= 31 && type2 == 29) {
                    zzgwm zzgwmVarZzb3 = zzb(audioDeviceInfo);
                    if (!zzgwmVarZzb3.isEmpty()) {
                        return zzgwmVarZzb3;
                    }
                    List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                    if (i10 >= 34) {
                        if (i10 < 34 || audioDescriptors == null) {
                            zzgwmVarZzi = zzgwm.zzi();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                            while (it.hasNext()) {
                                AudioDescriptor audioDescriptorA = l.a(it.next());
                                if (audioDescriptorA.getStandard() == 2) {
                                    byte[] descriptor = audioDescriptorA.getDescriptor();
                                    int length = descriptor.length;
                                    if (length != 3) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 21);
                                        sb2.append("Invalid SADB length: ");
                                        sb2.append(length);
                                        zzeg.zzc("AudioDescriptorUtil", sb2.toString());
                                    } else {
                                        int i11 = 0;
                                        if (Build.VERSION.SDK_INT >= 34) {
                                            byte b10 = descriptor[0];
                                            i11 = 1 == (b10 & 1) ? 12 : 0;
                                            if ((b10 & 2) != 0) {
                                                i11 |= 32;
                                            }
                                            if ((b10 & 4) != 0) {
                                                i11 |= 16;
                                            }
                                            if ((b10 & 8) != 0) {
                                                i11 |= PsExtractor.AUDIO_STREAM;
                                            }
                                            if ((b10 & 16) != 0) {
                                                i11 |= UserVerificationMethods.USER_VERIFY_ALL;
                                            }
                                            if ((b10 & 32) != 0) {
                                                i11 |= 768;
                                            }
                                            if ((b10 & 128) != 0) {
                                                i11 |= 201326592;
                                            }
                                            byte b11 = descriptor[1];
                                            if ((b11 & 1) != 0) {
                                                i11 |= 81920;
                                            }
                                            if ((b11 & 2) != 0) {
                                                i11 |= 8192;
                                            }
                                            if ((b11 & 4) != 0) {
                                                i11 |= 32768;
                                            }
                                            if ((b11 & 8) != 0) {
                                                i11 |= 6144;
                                            }
                                            if ((b11 & 16) != 0) {
                                                i11 |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                                            }
                                            if ((b11 & 32) != 0) {
                                                i11 |= MediaHttpUploader.MINIMUM_CHUNK_SIZE;
                                            }
                                            if ((b11 & 64) != 0) {
                                                i11 |= 6144;
                                            }
                                            if ((b11 & 128) != 0) {
                                                i11 |= 3145728;
                                            }
                                            byte b12 = descriptor[2];
                                            if ((b12 & 1) != 0) {
                                                i11 |= 655360;
                                            }
                                            if ((b12 & 2) != 0) {
                                                i11 = 8388608 | i11;
                                            }
                                            if ((b12 & 4) != 0) {
                                                i11 |= 20971520;
                                            }
                                        }
                                        arrayList.add(Integer.valueOf(i11));
                                    }
                                }
                            }
                            arrayList.sort(zzqo.zza);
                            zzgwmVarZzi = zzgwm.zzq(arrayList);
                        }
                        if (!zzgwmVarZzi.isEmpty()) {
                            return zzgwmVarZzi;
                        }
                    }
                    zzgwm zzgwmVarZza2 = zzqq.zza(audioDescriptors);
                    if (!zzgwmVarZza2.isEmpty()) {
                        return zzgwmVarZza2;
                    }
                } else if (i10 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i10 >= 31 && type == 22))) {
                    zzgwmVarZzb = zzb(audioDeviceInfo);
                    if (!zzgwmVarZzb.isEmpty()) {
                        return zzgwmVarZzb;
                    }
                }
            } else if (i10 >= 31) {
                zzgwmVarZzb = zzb(audioDeviceInfo);
                if (!zzgwmVarZzb.isEmpty()) {
                    return zzgwmVarZzb;
                }
            }
        }
        return zza;
    }

    private static zzgwm zzb(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzua.zza).reversed());
        Iterator<AudioProfile> it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileA = d2.a.a(it.next());
            if (audioProfileA.getEncapsulationType() != 1 && zzfl.zzD(audioProfileA.getFormat())) {
                for (int i10 : audioProfileA.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i10));
                }
            }
        }
        return zzgwm.zzq(treeSet);
    }
}
