// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 61-80
// ============================================================

// ============================================================
// Function #61
// Name: FUN_0001acc8
// Address: 0001acc8
// JNI: NO
// ============================================================


bool FUN_0001acc8(byte *param_1)

{
  uint uVar1;
  
  uVar1 = *(uint *)(param_1 + 4);
  if ((*param_1 & 1) == 0) {
    uVar1 = (uint)(*param_1 >> 1);
  }
  return uVar1 == 0;
}




// ============================================================
// Function #62
// Name: FUN_0001acde
// Address: 0001acde
// JNI: NO
// ============================================================


void FUN_0001acde(undefined4 param_1,byte *param_2)

{
  uint uVar1;
  byte *pbVar2;
  
  uVar1 = *(uint *)(param_2 + 4);
  pbVar2 = *(byte **)(param_2 + 8);
  if ((*param_2 & 1) == 0) {
    pbVar2 = param_2 + 1;
    uVar1 = (uint)(*param_2 >> 1);
  }
  FUN_0001a178(param_1,pbVar2,uVar1);
  return;
}




// ============================================================
// Function #63
// Name: FUN_0001acfa
// Address: 0001acfa
// JNI: NO
// ============================================================


void FUN_0001acfa(void)

{
  return;
}




// ============================================================
// Function #64
// Name: FUN_0001ad00
// Address: 0001ad00
// JNI: NO
// ============================================================


void FUN_0001ad00(undefined4 *param_1,undefined4 param_2,undefined4 param_3)

{
  *param_1 = param_3;
  param_1[1] = param_2;
  return;
}




// ============================================================
// Function #65
// Name: FUN_0001ad32
// Address: 0001ad32
// JNI: NO
// ============================================================


bool FUN_0001ad32(int param_1,int *param_2,int param_3)

{
  return param_1 == param_2[1] && *param_2 == param_3;
}




// ============================================================
// Function #66
// Name: FUN_0001ad48
// Address: 0001ad48
// JNI: NO
// ============================================================


void FUN_0001ad48(char *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 unaff_r5;
  undefined4 local_c;
  undefined4 uStack_8;
  undefined4 uStack_4;
  
  local_c = param_2;
  uStack_8 = param_3;
  uStack_4 = param_4;
  vfprintf((FILE *)(*(int *)(DAT_0001ada4 + 0x1ad66) + 0xa8),param_1,&local_c);
  vasprintf((char **)&stack0xffffffe4,param_1,&local_c);
  android_set_abort_message(unaff_r5);
  openlog((char *)(DAT_0001ada8 + 0x1ad88),0,0);
  syslog(2,(char *)(DAT_0001adac + 0x1ad94),unaff_r5);
  closelog();
                    /* WARNING: Subroutine does not return */
  abort();
}




// ============================================================
// Function #67
// Name: FUN_0001adb0
// Address: 0001adb0
// JNI: NO
// ============================================================


pthread_cond_t * FUN_0001adb0(pthread_cond_t *param_1)

{
  pthread_cond_destroy(param_1);
  return param_1;
}




// ============================================================
// Function #68
// Name: FUN_0001adc2
// Address: 0001adc2
// JNI: NO
// ============================================================


void FUN_0001adc2(pthread_cond_t *param_1)

{
  pthread_cond_signal(param_1);
  return;
}




// ============================================================
// Function #69
// Name: FUN_0001add0
// Address: 0001add0
// JNI: NO
// ============================================================


void FUN_0001add0(pthread_cond_t *param_1)

{
  pthread_cond_broadcast(param_1);
  return;
}




// ============================================================
// Function #70
// Name: FUN_0001ade0
// Address: 0001ade0
// JNI: NO
// ============================================================


void FUN_0001ade0(pthread_cond_t *param_1,undefined4 *param_2)

{
  int iVar1;
  int iVar2;
  
  if (*(char *)(param_2 + 1) == '\x01') {
    iVar1 = pthread_cond_wait(param_1,(pthread_mutex_t *)*param_2);
    if (iVar1 == 0) {
      return;
    }
    iVar2 = DAT_0001ae0c + 0x1ae02;
  }
  else {
    iVar1 = 1;
    iVar2 = DAT_0001ae08 + 0x1adfc;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,iVar2);
}




// ============================================================
// Function #71
// Name: FUN_0001ae10
// Address: 0001ae10
// JNI: NO
// ============================================================


pthread_mutex_t * FUN_0001ae10(pthread_mutex_t *param_1)

{
  pthread_mutex_destroy(param_1);
  return param_1;
}




// ============================================================
// Function #72
// Name: FUN_0001ae24
// Address: 0001ae24
// JNI: NO
// ============================================================


void FUN_0001ae24(pthread_mutex_t *param_1)

{
  int iVar1;
  
  iVar1 = pthread_mutex_lock(param_1);
  if (iVar1 == 0) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001ae38 + 0x1ae36);
}




// ============================================================
// Function #73
// Name: FUN_0001ae3c
// Address: 0001ae3c
// JNI: NO
// ============================================================


void FUN_0001ae3c(pthread_mutex_t *param_1)

{
  pthread_mutex_unlock(param_1);
  return;
}




// ============================================================
// Function #74
// Name: FUN_0001ae4a
// Address: 0001ae4a
// JNI: NO
// ============================================================


undefined4 * FUN_0001ae4a(undefined4 *param_1)

{
  if (*(char *)(param_1 + 1) == '\x01') {
    FUN_0001ae3c(*param_1);
  }
  return param_1;
}




// ============================================================
// Function #75
// Name: FUN_0001ae60
// Address: 0001ae60
// JNI: NO
// ============================================================


void FUN_0001ae60(int *param_1)

{
  if (*param_1 == 0) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #76
// Name: FUN_0001ae66
// Address: 0001ae66
// JNI: NO
// ============================================================


void FUN_0001ae66(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #77
// Name: FUN_0001ae70
// Address: 0001ae70
// JNI: NO
// ============================================================


void FUN_0001ae70(int *param_1)

{
  int iVar1;
  
  if (*param_1 == 0) {
    iVar1 = 0x16;
  }
  else {
    iVar1 = FUN_0001ae98(param_1);
    if (iVar1 == 0) {
      *param_1 = 0;
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001ae94 + 0x1ae90);
}




// ============================================================
// Function #78
// Name: FUN_0001ae98
// Address: 0001ae98
// JNI: NO
// ============================================================


void FUN_0001ae98(undefined4 *param_1)

{
  (*(code *)PTR_pthread_join_000a5f44)(*param_1,0);
  return;
}




// ============================================================
// Function #79
// Name: FUN_0001aea8
// Address: 0001aea8
// JNI: NO
// ============================================================


void FUN_0001aea8(int *param_1)

{
  int iVar1;
  
  if (*param_1 == 0) {
    iVar1 = 0x16;
  }
  else {
    iVar1 = FUN_0001aed0(param_1);
    if (iVar1 == 0) {
      *param_1 = 0;
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001ac4c(iVar1,DAT_0001aecc + 0x1aec8);
}




// ============================================================
// Function #80
// Name: FUN_0001aed0
// Address: 0001aed0
// JNI: NO
// ============================================================


void FUN_0001aed0(undefined4 *param_1)

{
  (*(code *)PTR_pthread_detach_000a5f30)(*param_1);
  return;
}




