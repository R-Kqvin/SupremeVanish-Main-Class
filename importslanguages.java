Êþº¾   4 h  co/kevinvanb/dev/VanishPlugin  !org/bukkit/plugin/java/JavaPlugin bossBar Lorg/bukkit/boss/BossBar; <init> ()V Code
     LineNumberTable LocalVariableTable this Lco/kevinvanb/dev/VanishPlugin; onEnable  vanish
     
getCommand 6(Ljava/lang/String;)Lorg/bukkit/command/PluginCommand;  co/kevinvanb/dev/VanishCommand
     "(Lco/kevinvanb/dev/VanishPlugin;)V
     org/bukkit/command/PluginCommand   ! setExecutor '(Lorg/bukkit/command/CommandExecutor;)V
  # $ % 	getServer ()Lorg/bukkit/Server; ' ) ( org/bukkit/Server * + getPluginManager #()Lorg/bukkit/plugin/PluginManager; - #co/kevinvanb/dev/PlayerJoinListener
 ,  0 2 1 org/bukkit/plugin/PluginManager 3 4 registerEvents 8(Lorg/bukkit/event/Listener;Lorg/bukkit/plugin/Plugin;)V 6 #co/kevinvanb/dev/PlayerQuitListener
 5  9 &aPoof! Vanished!
 ; = < co/kevinvanb/dev/C > ? TAC &(Ljava/lang/String;)Ljava/lang/String;	 A C B org/bukkit/boss/BarColor D E YELLOW Lorg/bukkit/boss/BarColor;	 G I H org/bukkit/boss/BarStyle J K SOLID Lorg/bukkit/boss/BarStyle; M org/bukkit/boss/BarFlag ' O P Q 
createBossBar {(Ljava/lang/String;Lorg/bukkit/boss/BarColor;Lorg/bukkit/boss/BarStyle;[Lorg/bukkit/boss/BarFlag;)Lorg/bukkit/boss/BossBar;	  S   	onDisable
 V X W co/kevinvanb/dev/VanishHandler Y Z getInstance "()Lco/kevinvanb/dev/VanishHandler;
 V \ ] ^ getPlayersInVanish ()Ljava/util/Set; ` b a 
java/util/Set c  clear 
getBossBar ()Lorg/bukkit/boss/BossBar; 
SourceFile VanishPlugin.java 1                	   /     *· 
±            
                	   –     \*¶ » Y*· ¶ *¶ "¹ & » ,Y*· .*¹ / *¶ "¹ & » 5Y*· 7*¹ / **¶ "8¸ :² @² F½ L¹ N µ R±           
   (  ?  [  
       \      T   	   :     ¸ U¶ [¹ _ ±       
       
             d e  	   /     *´ R°            
             f    g
