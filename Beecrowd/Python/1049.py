Animais = {
'vertebrado': {
    'ave': {'carnivoro': 'aguia', 'onivoro': 'pomba'},
    'mamifero': {'onivoro': 'homem', 'herbivoro': 'vaca'}},
'invertebrado': {
    'inseto': {'hematofago': 'pulga', 'herbivoro': 'lagarta'},
    'anelideo': {'hematofago': 'sanguessuga', 'onivoro': 'minhoca'}}
}

filo = input()
classe = input()
ordem = input()

print(Animais[filo][classe][ordem])
