var inputSectence ="This is a sunny day";
var words = inputSectence.split(' ');
var resversedWords = [];
for(var  i=0;i<words.length;i++)
{
    var word=words[i];
    var resversedWord =' ';
    for(var j=word.length - 1;j>=0;j--)
    {
        resversedWord += word[j];
    }
    resversedWords.push(resversedWord);
}
var resversedSentence = resversedWords.join(' ');
console.log(resversedSentence);
