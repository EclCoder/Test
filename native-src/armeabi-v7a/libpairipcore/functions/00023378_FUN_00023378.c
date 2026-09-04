/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00023378
 * Address  : 00023378
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00023378(int param_1,int *param_2,undefined4 *param_3,undefined4 param_4)

{
  undefined4 uVar1;
  undefined4 *puVar2;
  undefined4 uVar3;
  int iVar4;
  
  uVar1 = FUN_0001dbc0(param_1 + 0x198,0x14,param_3,param_4,param_3,param_4);
  iVar4 = *param_2;
  uVar3 = *param_3;
  puVar2 = (undefined4 *)FUN_0001e9c0(uVar1,0xd,*(byte *)(iVar4 + 5) >> 6,1,1);
  puVar2[2] = iVar4;
  puVar2[3] = uVar3;
  *(undefined1 *)(puVar2 + 4) = 0;
  *puVar2 = FUN_000233b4 + DAT_000233b0;
  return;
}


