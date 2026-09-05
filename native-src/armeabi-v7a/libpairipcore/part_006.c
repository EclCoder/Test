// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 101-120
// ============================================================

// ============================================================
// Function #101
// Name: FUN_0001b2d4
// Address: 0001b2d4
// JNI: NO
// ============================================================


void FUN_0001b2d4(code *param_1)

{
  (*param_1)();
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b2f4 + 0x1b2e0);
}




// ============================================================
// Function #102
// Name: FUN_0001b2fc
// Address: 0001b2fc
// JNI: NO
// ============================================================


undefined4 FUN_0001b2fc(void)

{
  DataMemoryBarrier(0x1b);
  return **(undefined4 **)(DAT_0001b310 + 0x1b306);
}




// ============================================================
// Function #103
// Name: FUN_0001b314
// Address: 0001b314
// JNI: NO
// ============================================================


void FUN_0001b314(void)

{
  int *piVar1;
  int iVar2;
  undefined4 uVar3;
  int iVar4;
  undefined4 uVar5;
  int iVar6;
  longlong lVar7;
  int *local_1c;
  
  piVar1 = (int *)FUN_0001b414();
  if ((piVar1 == (int *)0x0) || (iVar4 = *piVar1, iVar4 == 0)) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b3d0 + 0x1b32e);
  }
  iVar2 = FUN_00023fb0(iVar4 + 0x28);
  if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b3d8 + 0x1b3a8,*(undefined4 *)(DAT_0001b3d4 + 0x1b3a2));
  }
  lVar7 = FUN_00023fa6(iVar4 + 0x28);
  if (lVar7 == CONCAT44(DAT_0001b3bc,DAT_0001b3c0)) {
    local_1c = *(int **)(iVar4 + 4);
  }
  else {
    local_1c = (int *)(iVar4 + 0x80);
  }
  iVar2 = *(int *)(iVar4 + 8);
  iVar6 = *(int *)(iVar2 + 4);
  iVar4 = FUN_0001bb0c(iVar6,0,0,0);
  iVar2 = (**(code **)(**(int **)(DAT_0001b3c4 + 0x1b36e) + 0x10))
                    (*(int **)(DAT_0001b3c4 + 0x1b36e),iVar2,&local_1c);
  if (iVar4 == 0) {
    iVar4 = iVar6;
  }
  if (iVar2 == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001b3cc + 0x1b3b8,*(undefined4 *)(DAT_0001b3c8 + 0x1b3b2),iVar4);
  }
  uVar5 = *(undefined4 *)(DAT_0001b3dc + 0x1b386);
  uVar3 = (**(code **)(*local_1c + 8))();
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b3e0 + 0x1b39a,uVar5,iVar4,uVar3);
}




// ============================================================
// Function #104
// Name: FUN_0001b3e4
// Address: 0001b3e4
// JNI: NO
// ============================================================


void FUN_0001b3e4(void)

{
  *(int *)(DAT_0001b3f8 + 0x1b3f0) = DAT_0001b3fc + 0x1b3f2;
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #105
// Name: FUN_0001b400
// Address: 0001b400
// JNI: NO
// ============================================================


void FUN_0001b400(void)

{
  FUN_00025e6c(DAT_0001b410 + 0x1b40a);
  return;
}




// ============================================================
// Function #106
// Name: FUN_0001b414
// Address: 0001b414
// JNI: NO
// ============================================================


void FUN_0001b414(void)

{
  FUN_00025e6c(DAT_0001b424 + 0x1b41e);
  return;
}




// ============================================================
// Function #107
// Name: FUN_0001b428
// Address: 0001b428
// JNI: NO
// ============================================================


void FUN_0001b428(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001b568(DAT_0001b434 + 0x1b432);
}




// ============================================================
// Function #108
// Name: FUN_0001b438
// Address: 0001b438
// JNI: NO
// ============================================================


void FUN_0001b438(void)

{
  return;
}




// ============================================================
// Function #109
// Name: FUN_0001b440
// Address: 0001b440
// JNI: NO
// ============================================================


void FUN_0001b440(int *param_1)

{
  *param_1 = *(int *)(DAT_0001b450 + 0x1b44a) + 8;
  return;
}




// ============================================================
// Function #110
// Name: FUN_0001b454
// Address: 0001b454
// JNI: NO
// ============================================================


void FUN_0001b454(undefined4 param_1)

{
  FUN_0001b438();
  FUN_00023f68(param_1,4);
  return;
}




// ============================================================
// Function #111
// Name: FUN_0001b47c
// Address: 0001b47c
// JNI: NO
// ============================================================


void FUN_0001b47c(int *param_1)

{
  *param_1 = *(int *)(DAT_0001b4a0 + 0x1b488) + 8;
  FUN_0001b4a4(param_1 + 1);
  FUN_0001b438(param_1);
  return;
}




// ============================================================
// Function #112
// Name: FUN_0001b4a4
// Address: 0001b4a4
// JNI: NO
// ============================================================


int * FUN_0001b4a4(int *param_1)

{
  bool bVar1;
  int iVar2;
  uint *puVar3;
  uint uVar4;
  
  iVar2 = *param_1;
  DataMemoryBarrier(0x1b);
  puVar3 = (uint *)(iVar2 + -4);
  do {
    ExclusiveAccess(puVar3);
    uVar4 = *puVar3;
    bVar1 = (bool)hasExclusiveAccess(puVar3);
  } while (!bVar1);
  *puVar3 = uVar4 - 1;
  DataMemoryBarrier(0x1b);
  if (0x7fffffff < uVar4 - 1) {
    FUN_00023f5c(iVar2 + -0xc);
  }
  return param_1;
}




// ============================================================
// Function #113
// Name: FUN_0001b4d4
// Address: 0001b4d4
// JNI: NO
// ============================================================


void FUN_0001b4d4(undefined4 param_1)

{
  FUN_0001b47c();
  FUN_00023f68(param_1,8);
  return;
}




// ============================================================
// Function #114
// Name: FUN_0001b4ea
// Address: 0001b4ea
// JNI: NO
// ============================================================


undefined4 FUN_0001b4ea(int param_1)

{
  return *(undefined4 *)(param_1 + 4);
}




// ============================================================
// Function #115
// Name: FUN_0001b4f4
// Address: 0001b4f4
// JNI: NO
// ============================================================


void FUN_0001b4f4(int *param_1)

{
  *param_1 = *(int *)(DAT_0001b518 + 0x1b500) + 8;
  FUN_0001b4a4(param_1 + 1);
  FUN_0001b438(param_1);
  return;
}




// ============================================================
// Function #116
// Name: FUN_0001b51c
// Address: 0001b51c
// JNI: NO
// ============================================================


void FUN_0001b51c(undefined4 param_1)

{
  FUN_0001b4f4();
  FUN_00023f68(param_1,8);
  return;
}




// ============================================================
// Function #117
// Name: FUN_0001b532
// Address: 0001b532
// JNI: NO
// ============================================================


undefined4 FUN_0001b532(int param_1)

{
  return *(undefined4 *)(param_1 + 4);
}




// ============================================================
// Function #118
// Name: FUN_0001b53a
// Address: 0001b53a
// JNI: NO
// ============================================================


void FUN_0001b53a(undefined4 param_1)

{
  FUN_0001b47c();
  FUN_00023f68(param_1,8);
  return;
}




// ============================================================
// Function #119
// Name: FUN_0001b550
// Address: 0001b550
// JNI: NO
// ============================================================


void FUN_0001b550(undefined4 param_1)

{
  FUN_0001b4f4();
  FUN_00023f68(param_1,8);
  return;
}




// ============================================================
// Function #120
// Name: FUN_0001b568
// Address: 0001b568
// JNI: NO
// ============================================================


void FUN_0001b568(char *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  FILE *__s;
  char *local_2c;
  undefined4 *local_28;
  undefined4 local_c;
  undefined4 uStack_8;
  undefined4 uStack_4;
  
  __s = (FILE *)(*(int *)(DAT_0001b5e0 + 0x1b586) + 0xa8);
  local_c = param_2;
  uStack_8 = param_3;
  uStack_4 = param_4;
  fwrite((void *)(DAT_0001b5e4 + 0x1b590),0xb,1,__s);
  local_28 = &local_c;
  vfprintf(__s,param_1,&local_c);
  fputc(10,__s);
  vasprintf(&local_2c,param_1,&local_c);
  android_set_abort_message(local_2c);
  openlog((char *)(DAT_0001b5e8 + 0x1b5c8),0,0);
  syslog(2,(char *)(DAT_0001b5ec + 0x1b5d4),local_2c);
  closelog();
                    /* WARNING: Subroutine does not return */
  abort();
}




