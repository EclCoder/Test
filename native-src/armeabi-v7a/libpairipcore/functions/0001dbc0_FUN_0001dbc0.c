/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001dbc0
 * Address  : 0001dbc0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 * FUN_0001dbc0(int param_1,int param_2)

{
  undefined4 *puVar1;
  int iVar2;
  undefined4 *puVar3;
  uint uVar4;
  
  puVar3 = *(undefined4 **)(param_1 + 0x1000);
  uVar4 = param_2 + 0xfU & 0xfffffff0;
  iVar2 = puVar3[1];
  if (0xff7 < iVar2 + uVar4) {
    if (0xff8 < uVar4) {
      puVar1 = malloc(uVar4 | 8);
      if (puVar1 == (undefined4 *)0x0) goto LAB_0001dc2a;
      *puVar1 = *puVar3;
      puVar1[1] = 0;
      *puVar3 = puVar1;
      goto LAB_0001dc22;
    }
    puVar1 = malloc(0x1000);
    if (puVar1 == (undefined4 *)0x0) {
LAB_0001dc2a:
                    /* WARNING: Subroutine does not return */
      FUN_0001b280();
    }
    iVar2 = 0;
    *puVar1 = puVar3;
    puVar1[1] = 0;
    *(undefined4 **)(param_1 + 0x1000) = puVar1;
    puVar3 = puVar1;
  }
  puVar3[1] = iVar2 + uVar4;
  puVar1 = (undefined4 *)((int)puVar3 + iVar2);
LAB_0001dc22:
  return puVar1 + 2;
}


