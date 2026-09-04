/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001d830
 * Address  : 0001d830
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001d830(undefined4 *param_1,int param_2,uint param_3)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  
  iVar3 = *(int *)(param_2 + 0xc);
  if ((uint)(iVar3 - *(int *)(param_2 + 8) >> 2) < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001d8b0 + 0x1d8aa,DAT_0001d8b4 + 0x1d8ac,0xb18,DAT_0001d8b8 + 0x1d8ae,
                 &stack0xfffffff8);
  }
  iVar2 = *(int *)(param_2 + 8) + param_3 * 4;
  iVar4 = iVar3 - iVar2;
  uVar1 = FUN_0001dbc0(param_2 + 0x198,iVar4);
  if (iVar3 != iVar2) {
    __aeabi_memmove4(uVar1,iVar2,iVar4);
  }
  *param_1 = uVar1;
  param_1[1] = iVar4 >> 2;
  if ((uint)(*(int *)(param_2 + 0xc) - *(int *)(param_2 + 8) >> 2) < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_0001b568(DAT_0001d8bc + 0x1d896,DAT_0001d8c0 + 0x1d898,0x86,DAT_0001d8c4 + 0x1d89a);
  }
  *(uint *)(param_2 + 0xc) = *(int *)(param_2 + 8) + param_3 * 4;
  return;
}


