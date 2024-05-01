# RENT A CAR PROJESİ


## KULLANILAN TEKNOLOJİLER

- jAVA 21
- SWİNGGUI
- POSTGRESQL
- jDBC

## PROJE TANIMI



- Bu proje, araç kiralama işlemlerini gerçekleştirmek amacıyla oluşturulmuştur. Bu projede, araç kiralama işlemleri yapılabilir.

## PROJE İÇERİĞİ

- Proje genel olarak dört ana modülden oluşur: entity, dao, business  ve view. Bu modüller projenin farklı katmanlarını temsil eder ve her biri belirli bir görevi yerine getirir.

#### Entity Modülü

- Veritabanı tablolarını ve bu tablolara ait varlık nesnelerini tanımlar.

- Kullanıcı, marka, model, araç, rezervasyon gibi temel entity nesnelerini içerir.

- Bu nesneler arasındaki ilişkileri belirler.

#### DAO (Veri Erişim Nesnesi) Modülü

- Veritabanı erişimi ve işlemleri için bir arayüz sağlar.

- Entity modülündeki nesnelerin veritabanına kaydedilmesi, güncellenmesi ve silinmesi süreçlerini yönetir.

- Veritabanından veri alma işlemlerini gerçekleştirir.

### Business Modülü

- İş mantığını yönetir ve uygulama içindeki temel işlemleri gerçekleştirir.

- Fiyatlandırma ve araç kiralama hesaplamaları gibi iş mantığı operasyonlarını yönetir.

- Veritabanı işlemleri için dao modülü ile etkileşime girer.

### View Modülü

- Kullanıcı arayüzünü (UI) yönetir ve kullanıcıyla etkileşimi sağlar.

- Araç listesi ve kiralama ekranı gibi kullanıcı bilgilerini gösterir.

- Kullanıcının girdiği bilgileri iş katmanına ileterek işlemleri başlatır.

- Bu modüller projenin katmanlı mimarisini oluşturarak kodun düzenli, modüler ve bakımı kolay olmasını sağlar. Entity nesnelerini,  veritabanı erişimini, iş mantığını ve kullanıcı arayüzünü ayrı ayrı ele almak, geliştirme sürecini daha yönetilebilir hale getirir ve ek işlevler eklemeyi kolaylaştırır.

- Projenin temel isterleri şunlardır:

- Firmadaki tüm araçların sisteme kaydedilmesi.

- Her araca ait plaka bilgilerinin tutulması.

- Sistem üzerinden belirli kriterlere göre uygun ve müsait araçların listelenmesi.

- Rezervasyon işleminin yapılması.

- Rezervasyon işleminin iptal edilmesi.

#### Proje Geliştiricisi

- [Ali Osman UYSAL](https://www.linkedin.com/in/aliosmanuysal/)